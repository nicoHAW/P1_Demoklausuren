package javaRecords;

public class startRecord {

    public static void main(String[] args) {
        
        RecordPerson person = new RecordPerson("Al", "Jenkovich", 26);
        
        System.out.print(person);
        
        System.out.print(person.vorname() + " "+" " + person.nachname() );
        System.out.print(person.alter());
        
        
        
    }

}
