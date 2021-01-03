import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Scanner; 

class FibonachiRecursiveHash {

	HashMap<Integer, BigInteger> fibMap = new HashMap<Integer, BigInteger>();
	
	public BigInteger solution(int n) {

		if(n==0) {return new BigInteger("0");}

		if(n==1) {return new BigInteger("1");}
		
		if (!fibMap.containsKey(n)) {
			BigInteger temp = solution(n - 1).add(solution(n - 2));
			
			fibMap.put(n,temp);
			return temp;
		}
		
		return fibMap.get(n);
	}

}

