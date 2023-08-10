/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//64050355 Jirapat Pichai
package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type Regular, Mountain, Delinquent : ");
        String type = inp.next();
        Customer myCustomer = CustomerFactory.createCustomer(type);
        System.out.println(myCustomer.createMail());        
    }
}
