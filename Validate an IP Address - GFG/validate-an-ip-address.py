#User function Template for python3

def isValid(s):
    #code here
    
    lis  = s.split(".")
    if len(lis)!=4 :
        return 0
    for i in range(4):
        if lis[i].isnumeric()==False:
            return 0
        if int(lis[i])>255 or int(lis[i])<0:
            return 0
            
        if len(lis[i])>1:
            if lis[i][0]=="0":
                return 0
       
   
    
    return 1            



#{ 
 # Driver Code Starts
#Initial Template for Python 3

    
if __name__=="__main__":
    t=int(input())
    for _ in range(0,t):
        s=input()
        if(isValid(s)):
            print(1)
        else:
            print(0)
    

# } Driver Code Ends