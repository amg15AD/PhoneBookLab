import java.util.*;

//name : phoneNumber1, phoneNumber1
//name: phoneNumber

// String , ArrayList of Strings, Map of some kind
//Map to hold name and phoneNumbers
//Key is String and values is arrayList of String

    public class PhoneBook {
        private Map<String, List<String>> phoneRecord;

        public PhoneBook() {
            this(new HashMap<>());
        }

        public PhoneBook(Map<String, List<String>> phoneRecord) {
            this.phoneRecord = phoneRecord;
        }

        //Create a method to add a number to the phonebook

        public void add(String name, String phoneNumber) {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phoneRecord.put(name, numbers);  //put the record in the map
        }

        //Create a method to addAll Numbers to a phoneRecord
        public void addAll(String name, String... phoneNumbers) {
            //put the record in the map by key and values
            List<String> numbers = new ArrayList<>();
            for (String p : phoneNumbers) {
                numbers.add(p);
            }
            phoneRecord.put(name, numbers);
        }

        //Method to remove a person
        public void remove(String name) {
            //remove from the map
            phoneRecord.remove(name);
        }

        //HasEntry - to check if entry exist
        public Boolean hasEntry(String name) {
            //check if name exist in record and return true
            return phoneRecord.containsKey(name);

        }

        //lookUp (name) - return phone number(s)
        public List<String> lookup(String name) {
            //return a list of phone numbers that belong to the name
            return phoneRecord.get(name);

        }

        //reverse lookUp (phoneNumber) - return phone name
        public String reverseLookUp(String phoneNumber) {
            List<String> checkNum = new ArrayList<>();
            checkNum.add(phoneNumber);
            for (Map.Entry<String, List<String>> s : phoneRecord.entrySet()) {
                if (s.getValue().equals(checkNum)) {
                    return s.getKey();
                }

            }
            return "Number not found";
        }

        //Get allContactNames in the phoneBook
        public List<String> getAllContactNames() {
            List<String> contacts = new ArrayList<>();
            Iterator<String> it = phoneRecord.keySet().iterator();

            while (it.hasNext()){
                contacts.add(it.next());
            }
            return contacts;
            //need a list or container to store the names
            //need to iterate through the map
            //add each name to the list or container
            //return the container
        }


        //A way to represent the String Object
        @Override
        public String toString() {
            String people ="";


            for (Map.Entry<String, List<String>> s : phoneRecord.entrySet()){
                people += s.getKey() +" : " + s.getValue()+ "\n";
            }
            return people;
        }


    }

