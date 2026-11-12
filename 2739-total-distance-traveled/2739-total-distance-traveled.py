class Solution:
    def distanceTraveled(self, mainTank: int, additionalTank: int) -> int:
        avg = 0
        while mainTank >=5:
            mainTank -= 5
            if additionalTank>0:
                additionalTank-=1
                mainTank+=1
            avg += 50
            
        avg += mainTank*10
    
        return avg

        