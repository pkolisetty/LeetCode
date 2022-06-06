class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        res = 0
        for i in range(1, 33):
            m = n % 2
            print(m)
            n = n//2
            print(n)
            res += m * (2**(32-i))
            print(res)
            
        return res
            
            