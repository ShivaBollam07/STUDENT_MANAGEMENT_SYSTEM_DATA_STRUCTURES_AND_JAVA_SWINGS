package com.mycompany.student_management_system;

public class MainFun
{
    public static void main(String[] args)
    {
        dbms db = new dbms() ;
        BinarySearchTree bst = db.dbms() ;
        MAIN mn = new MAIN(bst) ;
        mn.setVisible(true) ;

    }

}
