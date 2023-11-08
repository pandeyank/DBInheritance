package com.scaler.DBInheritanceDemo.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity

public class Student extends User{
    private double psp;
}
