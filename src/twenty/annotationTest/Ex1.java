package twenty.annotationTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 1.实现更多的类型
 * 2.连接真正的数据库
 * 3.生成xml文件，而不是sql
 * @author pocan
 *
 */
public class Ex1 {
	public static void main(String[] args) {
		//必须全称
		String className = "twenty.annotationTest.Member";
		try {
			Class<?> cl = Class.forName(className);
			
			DBTable dbTable = cl.getAnnotation(DBTable.class);
			String tableName = dbTable.name().toLowerCase();
			
			List<String> columnDefs = new ArrayList<>();
			
			for(Field field : cl.getDeclaredFields()) {
				String columnName = null;
				Annotation[] anns = field.getDeclaredAnnotations();
				if(anns.length < 1) 
					continue;
				//如果是整形
				if(anns[0] instanceof SQLInteger) {
					SQLInteger sInt = (SQLInteger) anns[0];
					//字段名
					if(sInt.name().length() < 1) 
						columnName = field.getName().toUpperCase();
					else {
						columnName = sInt.name();
					}
					columnDefs.add(columnName + " INT" + getConstraints(sInt.constraints()));
				}
				//如果是字符型
				if(anns[0] instanceof SQLString) {
					SQLString sStr = (SQLString) anns[0];
					if(sStr.name().length() < 1) 
						columnName = field.getName().toUpperCase();
					else {
						columnName = sStr.name();
					}
					columnDefs.add(columnName + " VARCHAR(" + sStr.value() + ")" + getConstraints(sStr.constraints()));
				}
				
				if(anns[0] instanceof SQLDatetime) {
					SQLDatetime SQLDatetime = (SQLDatetime) anns[0];
					if(SQLDatetime.name().length() < 1) 
						columnName = field.getName().toUpperCase();
					else {
						columnName = SQLDatetime.name();
					}
					columnDefs.add(columnName + " Datetime");
				}
				
			}
			
			//StringBuilder因版本问题没使用
			String createCommand = "CREATE TABLE " + tableName + "(";
			for(String columnDef : columnDefs) {
				createCommand += "\n" + columnDef + ",";
			}
			String tableCreate = createCommand.substring(0, createCommand.length()-1) + ")";
			System.out.println("Table Creation SQL is for:" + className + " is: " + tableCreate);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static String getConstraints(Constraints con) {
		String constraints = "";
		if(!con.allowNull()) 
			constraints += " NOT NULL";
		if(con.primaryKey()) 
			constraints += " PRIMARY KEY";
		if(con.unique())
			constraints += " UNIQUE";
		return constraints;
	}
}
