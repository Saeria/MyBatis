package com.test.pojo;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test_insert {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();
        Student c = new Student();
        c.setName(" newStudent");
        session.insert("addCategory",c);
        List<Student> cs=session.selectList("listStudent");
        for (Student s : cs) {
			System.out.println(s.getName());
		}
        session.commit();
        session.close();
		
	}
}
