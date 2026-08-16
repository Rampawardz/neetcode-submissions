class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result=new int[arr1.length];
        boolean[] visited=new boolean[arr1.length];
        int index=0;

        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr2[i]==arr1[j]){
                    result[index++]=arr1[j];
                    visited[j]=true;
                }
            }
        }

        List<Integer> remaining=new ArrayList<>();
        for(int j=0; j<arr1.length; j++){
            if(!visited[j]){
                remaining.add(arr1[j]);
            }
        }

        Collections.sort(remaining);

        for(int num: remaining){
            result[index++]=num;
        }

        return result;
    }
}