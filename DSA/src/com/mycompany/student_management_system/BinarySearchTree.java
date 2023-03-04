package com.mycompany.student_management_system;


import java.util.Collection;
import java.util.Iterator;



public class BinarySearchTree
{

     private node root ;
     class node
     {
          node left ;
          node right ;

          int rollnumber  ;
          String StudentName ;


          node(String studentname,
          int rollnumber
          )
          {
               this.StudentName = studentname ;
               this.rollnumber = rollnumber ;


          }
     }
    public void add(String studentname, int rollnumber)
     {
          node n = new node(studentname, rollnumber) ;
          if(root==null)
          {
               root = n ;
          }
          else
          {
               node rooty = root ;
               while(rooty!=null)
               {
                    if(n.rollnumber>rooty.rollnumber)
                    {
                         if(rooty.right==null)
                         {
                              rooty.right = n ;
                              return;
                         }
                         rooty = rooty.right ;
                    }
                    else if(n.rollnumber<rooty.rollnumber)
                    {
                         if(rooty.left==null)
                         {
                              rooty.left = n ;
                              return;
                         }
                         rooty = rooty.left ;
                    }
                    else
                    {
                         return;

                    }
               }
          }
     }

     public String Search(int element)
     {
          if(root==null) return null ;
          else
          {
               node roots = root ;
               while(roots!=null)
               {
                    if(roots.rollnumber>element)
                    {
                         if(roots.left==null) return null ;
                         else roots = roots.left ;
                    } else if (roots.rollnumber<element)
                    {
                       if(roots.right==null) return null ;
                       else roots = roots.right ;
                    }
                    else
                    {
                         return roots.StudentName ;
                    }
               }
          }
          return null ;
     }

}
