class Solution:
    def checkDivisibility(self, n: int) -> bool:
        dsum = 0
        pro = 1
        tem = n

        while tem > 0:
            dsum += tem % 10
            pro *= tem % 10
            tem //= 10

        return n % (dsum + pro) == 0