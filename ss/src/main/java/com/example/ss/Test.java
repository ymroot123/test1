package com.example.ss;

public class Test {
    public static void main(String[] args) {
        com.example.ss.StudentDaoImpl studentDao;
        studentDao=new com.example.ss.StudentDaoImpl();
        System.out.println(studentDao.searchByCondition("S0", "", "", "", ""));
    }
}
