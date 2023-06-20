#User function Template for python3
class Solution:
    ##Complete this function
    #Function to rearrange  the array elements alternately.
    def rearrange(self,arr, n): 
        min_i = 0
        max_i = n-1
        mod = arr[n-1] + 1
        
        for i in range(len(arr)):
            if i%2 ==0:
                arr[i] = (arr[max_i]% mod)*mod + arr[i]
                max_i -= 1
            else:
                arr[i] = (arr[min_i]% mod)*mod + arr[i]
                min_i += 1
        
        for i in range(len(arr)):
            arr[i] = arr[i]//mod
                
        
#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math




def main():
        T=int(input())
        while(T>0):
            
            n=int(input())
            
            arr=[int(x) for x in input().strip().split()]
            
            ob=Solution()
            ob.rearrange(arr,n)
            
            for i in arr:
                print(i,end=" ")
            
            print()
            
            T-=1


if __name__ == "__main__":
    main()
# } Driver Code Ends