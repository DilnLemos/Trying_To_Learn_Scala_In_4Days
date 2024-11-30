package taller

class T1Factorial {
  def calculateFactorial(n: Int): BigInt = {

    if (n==0) 1 else n*calculateFactorial(n-1)
  }
}
