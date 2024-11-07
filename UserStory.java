import java.util.Scanner;
//class instantiation
public class UserStory {
//declaration of an instance variable with PeriodicTable[] data type
  private PeriodicTable[] elementData;
  /*
  User Story constructor which creates elementData and utilizes a separate method called createInfo() in 
  order to the array containing data of each element.
  */
public UserStory(String atomicFile, String symbolFile, String nameFile, String massFile) {
   elementData = createInfo(atomicFile, symbolFile, nameFile, massFile);
  }

  /*
 createInfo method which reads the data from the files passed as arguments in the DataRunner class and
 stores them in to their own individual arrays. It then uses a for loop to create one large array of 
 PeriodicTable objects containing data from each array as one element.
   */
  public PeriodicTable[] createInfo(String atomicFile, String symbolFile, String nameFile, String massFile) {
    int[] atomicNumberArray = FileReader.toIntArray(atomicFile);
    String[] atomicSymbolArray = FileReader.toStringArray(symbolFile);
    String[] elementNameArray = FileReader.toStringArray(nameFile);
    double[] atomicMassArray = FileReader.toDoubleArray(massFile);

  PeriodicTable[] orderedElements = new PeriodicTable[atomicNumberArray.length];

    for (int index = 0; index < orderedElements.length; index++) {
      orderedElements[index] = new PeriodicTable(
        atomicNumberArray[index],
        atomicSymbolArray[index], 
        elementNameArray[index], 
        atomicMassArray[index]);
    }

    return orderedElements;
}

  
  //returns element data
public PeriodicTable[] getElementData(){
  return elementData;
}

  /*
  For loop which traverses each element of the PeriodicTable object element. It utilizes a user input
  to and a accessor method to determine which element the user is searching for. Once it finds the 
  element it will return the toString method with all the data. If it doesn't it will return element 
  not found.
  */
  public String findElementByName(String element) {
for(PeriodicTable duck: elementData ){
  if(duck.getElementName().equalsIgnoreCase(element)){
   return duck.toString();
  }
}
return "Element Not Found ";
  }

  //Is utilized to print the data for all the elements
  public String toString(){
    String result="";
    for (PeriodicTable element:elementData){
      result+=element+"\n";
    }
 return result;
  }
    }