package javaRecords;

public record RecordPerson(String vorname, String nachname, int alter) implements Comparable<RecordPerson> {

    @Override
    public int compareTo(RecordPerson o) {
        // TODO Auto-generated method stub
        return 0;
    }

}

