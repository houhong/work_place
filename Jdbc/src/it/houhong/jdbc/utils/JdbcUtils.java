package it.houhong.jdbc.utils;


import org.junit.Test;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @autor: houhong
 * @title:
 * @projectName Demo
 * @description: TODO
 * @date 2019/6/24 17:54
 */
public class JdbcUtils {

    private static String driver = null;
    private static String url = null;
    private static String userName = null;
    private static String passWord = null;
    private static Properties pro =null;

    private static FileInputStream fis = null;

    //����
    private static Connection connection = null;
    private static PreparedStatement pstt = null;
    private static ResultSet rs = null;

    //ע��
    static {
        try {

            pro = new Properties();
            fis = new FileInputStream("database.properties");
            pro.load(fis);

            //��ʼ������
            driver = pro.getProperty("driver");
            url = pro.getProperty("url");
            userName = pro.getProperty("userName");
            passWord = pro.getProperty("passWord");
          
            
    



            fis.close();
            //ע��
          Class.forName("com.mysql.jdbc.Driver");


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public JdbcUtils() {

    }

    //дutils
    public static Connection getConn() {

        try {
            connection = DriverManager.getConnection(url, userName, passWord);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


    public static PreparedStatement getPstt(String sql) {

        try {
            pstt = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pstt;
    }


    public static ResultSet getRs() {

        try {
            rs = pstt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static void setRs(ResultSet rs) {
        JdbcUtils.rs = rs;
    }

    public static void main(String[] args) {
        JdbcUtils jdbcUtils = new JdbcUtils();
        System.err.println(jdbcUtils.WgetConn());	

        //ע�᷽��


    }
}

