#User function Template for python3

class Solution:
    ##Complete this function
    # Function to find number of bits needed to be flipped to convert A to B
    def countBitsFlip(self,a,b):
       bit1 = (bin(a))[2:]
       bit2 = (bin(b))[2:]
       
       lend = abs(len(bit1)-len(bit2))
       
       if len(bit1)<len(bit2):
           bit1 = "0"*lend + bit1
       if len(bit1)>len(bit2):
           bit2 = "0"*lend + bit2
           
       count = 0
       
       for i in range(0,len(bit2)):
           if bit1[i]!= bit2[i]:
               count+=1
       return count       


#{ 
 # Driver Code Starts
#Initial Template for Python 3


import math



def main():
    
    T=int(input())
    
    while(T>0):
        
        
        ab=[int(x) for x in input().strip().split()]
        a=ab[0]
        b=ab[1]
        ob=Solution()
        print(ob.countBitsFlip(a,b))
        T-=1

if __name__=="__main__":
    main()
# } Driver Code Ends