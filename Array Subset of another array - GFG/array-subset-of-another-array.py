#User function Template for python3

def isSubset( a1, a2, n, m):
    out = "Yes"
    
    for i in a2:
        if i in a1:
            a1.remove(i)
        else:
            out = "No"
            break
        
    return out
    
    
    
    



#{ 
 # Driver Code Starts
#Initial Template for Python 3


def main():

    T = int(input())

    while(T > 0):
        sz = [int(x) for x in input().strip().split()]
        n, m = sz[0], sz[1]
        a1 = [int(x) for x in input().strip().split()]
        a2 = [int(x) for x in input().strip().split()]
        
        print(isSubset( a1, a2, n, m))

        T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends