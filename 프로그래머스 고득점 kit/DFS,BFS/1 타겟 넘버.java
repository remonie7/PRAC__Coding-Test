
public class test1 {
    public static int solution(int[] numbers, int target) {
        int answer = 0;        
        answer=dfs(numbers, 0, 0, target);        
        return answer;        
    }
    
    public static int dfs(int[] numbers, int index, int sum, int target) {
    	if(index==numbers.length) {
    		if(sum==target)
    			return 1;
    		return 0;
    	}    	
    	return dfs(numbers, index+1, sum+numbers[index], target) + dfs(numbers, index+1, sum-numbers[index], target);
    }

	public static void main(String[] args) {
		int[] numbers= {1,1,1,1,1};
		int target=3;
		System.out.println(solution(numbers, target));
	}
}
