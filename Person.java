package person_message;
import java.sql.Connection;
import java.sql.PreparedStatement;
/*import java.sql.ResultSet;
import java.util.*;
import java.io.*;*/
import java.io.IOException;

public class Person {
	String ID;
	String name;
	String Jianjie;
	String sex;
	String tele;
	String email;
	private Connection conn = null;
    private PreparedStatement ps = null;
    //private ResultSet rs = null;//��������洢��ѯ����Ķ���
	public Person(String na,String ssex,String ttele,String jian,String em,String id){
    	ID=id;
    	name=na;
    	sex=ssex;
    	Jianjie=jian;
    	tele=ttele;
    	email=em;
    }
	public  void updatename(String name,String ID)throws IOException{  //�޸ĸ����ǳ�
        try{
            conn = DBConn1.createDBConn();
            String sql = "update person set name=? where ID=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2, ID);
            if(ps.executeUpdate()>0){
            	System.out.println("�޸ĳɹ���");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            DBConn1.closeConn(conn);
        }
    }
	
	public  void updateJianjie(String Jianjie,String ID)throws IOException{  //�޸ĸ��˼��
        try{
            conn = DBConn1.createDBConn();
            String sql = "update person set Jianjie=? where ID=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,Jianjie);
            ps.setString(2, ID);
            if(ps.executeUpdate()>0){
            	System.out.println("�޸ĳɹ���");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            DBConn1.closeConn(conn);
        }
    }
	
	public  void updatesex(String sex,String ID)throws IOException{  //�޸ĸ����Ա�
        try{
            conn = DBConn1.createDBConn();
            String sql = "update person"+" set sex=? where ID=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,sex);
            ps.setString(2, ID);
            if(ps.executeUpdate()>0){
            	System.out.println("�޸ĳɹ���");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            DBConn1.closeConn(conn);
        }
    }
	
	public  void updatephone(String tele,String ID)throws IOException{  //�޸ĸ�����ϵ��ʽ
        try{
            conn = DBConn1.createDBConn();
            String sql = "update person set telephone=? where ID=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,tele);
            ps.setString(2, ID);
            if(ps.executeUpdate()>0){
            	System.out.println("�޸ĳɹ���");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            DBConn1.closeConn(conn);
        }
    }
	
	public  void updateemail(String email,String ID)throws IOException{  //�޸ĸ�������
        try{
            conn = DBConn1.createDBConn();
            String sql = "update person set email=? where ID=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,email);
            ps.setString(2, ID);
            if(ps.executeUpdate()>0){
            	System.out.println("�޸ĳɹ���");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            DBConn1.closeConn(conn);
        }
    }

}
