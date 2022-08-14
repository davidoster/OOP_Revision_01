/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_revision_01;

import oop_revision_01.summercamp.models.CampPackage;
import oop_revision_01.summercamp.models.Camper;
import oop_revision_01.summercamp.models.Employee;
import oop_revision_01.summercamp.models.Human;
import oop_revision_01.summercamp.services.CampHolidays;

/**
 *
 * @author mac
 */
public class OOP_Revision_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create Humans / Employees / Campers
        Human human = new Human();
        Employee employee = new Employee();
        Camper camper = new Camper();
        
        // create Camping packages
        CampPackage campPackage = new CampPackage();
        
        // create CampHolidaysInterface variable for providing a service
        CampHolidays campHolidays = new CampHolidays();
    }
    
}
