import java.util.Comparator;

class IntegerComparator implements Comparator<Integer>{ 
        
        // Overriding compare()method of Comparator  
                    // for descending order of cgpa 
        public int compare(Integer I1, Integer I2) { 
            if (I1 < I2) 
                return 1; 
            else if (I1 > I2) 
                return -1; 
                            return 0; 
            } 
    } 


