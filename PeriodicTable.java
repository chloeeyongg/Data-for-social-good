import java.util.Scanner;

public class PeriodicTable {
//initializes instance variables for the class
  private int atomicNumber;
  private String atomicSymbol;
  private String elementName;
  private double atomicMass;
//no argument constructor that sets default values
public PeriodicTable(){
  this.atomicNumber = 0;
    this.atomicSymbol = "unknown";
    this.elementName = "unknown";
    this.atomicMass = 0.0;
}
  
/*
The paramaterized constructor for all classes of information which contains
information regarding specific elements 
*/   
  public PeriodicTable(int atomicNumber, String atomicSymbol, String elementName, double atomicMass) {
    this.atomicNumber = atomicNumber;
    this.atomicSymbol = atomicSymbol;
    this.elementName = elementName;
    this.atomicMass = atomicMass;
  }

  // Accessor method for atomicNumber
  public int getAtomicNumber() {
    return atomicNumber;
  }

  // Accessor method for atomicSymbol
  public String getAtomicSymbol() {
    return atomicSymbol;
  }

  // Accessor method for elementName
  public String getElementName() {
    return elementName;
  }

  // Accessor method for atomicMass
  public double  getAtomicMass() {
    return atomicMass;
  }

  //toString method that prints the return statement with information of all the elements
  public String toString(){
  return elementName+":\nAtomic Number: "+atomicNumber+"\nAtomic Symbol: "+atomicSymbol+"\nAtomic Mass: "+atomicMass+"\n\n";
  }
}
