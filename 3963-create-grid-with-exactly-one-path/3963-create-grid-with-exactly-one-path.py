class Solution:
    def createGrid(self, m: int, n: int) -> list[str]:
        s = ""
        l = []
        for i in range(n):
            s+="."
        l.append(s)
        s1 = ""
        for i in range(n-1):
            s1+="#"
        s1+="."
        for i in range(m-1):
             l.append(s1)

        return l




            



        