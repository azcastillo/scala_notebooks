Last login: Wed Jul 20 06:48:53 on ttys000
andrewcastillo@Andrews-Air ~ % scala
Welcome to Scala 3.1.3 (1.8.0_292, Java OpenJDK 64-Bit Server VM).
Type in expressions for evaluation. Or try :help.
                                                                                                                    
scala> //Chapter 5 Notes: Basic Types and Operations 
                                                                                                                    
scala> val hex = 0x5
val hex: Int = 5
                                                                                                                    
scala> val hex2 = 0x00FF
val hex2: Int = 255
                                                                                                                    
scala> val tower = 35L
val tower: Long = 35
                                                                                                                    
scala> // Similar to Python 
                                                                                                                    
scala> val big = 1.2345
val big: Double = 1.2345
                                                                                                                    
scala> val bigger = 1.2345e1
val bigger: Double = 12.345
                                                                                                                    
scala> val biggerStill = 123E45
val biggerStill: Double = 1.23E47
                                                                                                                    
scala> val trillion = 1_000_000_000e3
val trillion: Double = 1.0E12
                                                                                                                    
scala> // unicode characters are characters that can be translated through code through a multitude of ways 
                                                                                                                    
scala> val d = '\u0041'
val d: Char = A
                                                                                                                    
scala> val d = '\0044'
-- Error: ----------------------------------------------------------------------
1 |val d = '\0044'
  |         ^
  |         octal escape literals are unsupported: use \u0004 instead
-- Error: ----------------------------------------------------------------------
1 |val d = '\0044'
  |        ^
  |        unclosed character literal
-- Error: ----------------------------------------------------------------------
1 |val d = '\0044'
  |              ^
  |              unclosed character literal
                                                                                                                    
scala> val d = '\u0044'
val d: Char = D
                                                                                                                    
scala> println("""Welcome to Ultamix 3000.
     | Type "Help" for help""")
Welcome to Ultamix 3000.
Type "Help" for help
                                                                                                                    
scala> val name = "reader"
val name: String = reader
                                                                                                                    
scala> println(s"Hello, $name")
Hello, reader
                                                                                                                    
scala> // curly braces for non idenifier characters 
                                                                                                                    
scala> s"The answer is ${6*7}."
val res0: String = The answer is 42.
                                                                                                                    
scala> f"${math.Pi}%.5f"
val res1: String = 3.14159
                                                                                                                    
scala> val pi = "Pi"
val pi: String = Pi
                                                                                                                    
scala> f"$pi is approx ${math.Pi}%.8f"
val res2: String = Pi is approx 3.14159265
                                                                                                                    
scala> // so f is really like an f-string in Python. 
                                                                                                                    
scala> // Operators and Methods 
                                                                                                                    
scala> val sum = 1 + 2
val sum: Int = 3
                                                                                                                    
scala> val difference = 2-1
val difference: Int = 1
                                                                                                                    
scala> val difference = 3-2
val difference: Int = 1
                                                                                                                    
scala> val mult = 2*4
val mult: Int = 8
                                                                                                                    
scala> val s = "Hello, World"
val s: String = Hello, World
                                                                                                                    
scala> s indexOf 'o'
val res3: Int = 4
                                                                                                                    
scala> s indexOf 'H'
val res4: Int = 0
                                                                                                                    
scala> s indexOf 'W'
val res5: Int = 7
                                                                                                                    
scala> val s = "Hello, World"
val s: String = Hello, World
                                                                                                                    
scala> import scala.language.postfixOps
                                                                                                                    
scala> s.toLowerCase
val res6: String = hello, world
                                                                                                                    
scala> var sum = 1+2
var sum: Int = 3
                                                                                                                    
scala> val sum = 1.4 + 4.6
val sum: Double = 6.0
                                                                                                                    
scala> 11 % 4 
val res7: Int = 3
                                                                                                                    
scala> 11 / 4
val res8: Int = 2
                                                                                                                    
scala> 11.0f / 4.0f
val res9: Float = 2.75
                                                                                                                    
scala> 11.0 % 4.0
val res10: Double = 3.0
                                                                                                                    
scala> val = 1 + -3
-- [E032] Syntax Error: --------------------------------------------------------
1 |val = 1 + -3
  |    ^
  |    pattern expected
  |
  | longer explanation available when compiling with `-explain`
                                                                                                                    
scala> val neg  = 1 + -3
val neg: Int = -2
                                                                                                                    
scala> -neg
val res11: Int = 2
                                                                                                                    
scala> // relational expressions 
                                                                                                                    
scala> 1 > 2
val res12: Boolean = false
                                                                                                                    
scala> 1 < 5
val res13: Boolean = true
                                                                                                                    
scala> 3.5f >= 3.6f
val res14: Boolean = false
                                                                                                                    
scala> val toBe = True
-- [E006] Not Found Error: -----------------------------------------------------
1 |val toBe = True
  |           ^^^^
  |           Not found: True
  |
  | longer explanation available when compiling with `-explain`
1 error found
                                                                                                                    
scala> val toBe = true
val toBe: Boolean = true
                                                                                                                    
scala> val question = toBe || toBe 
val question: Boolean = true
                                                                                                                    
scala> val question = toBe || !toBe
val question: Boolean = true
                                                                                                                    
scala> val question1 = toBe && !toBe
val question1: Boolean = false
                                                                                                                    
scala> // cant be true and not true 
                                                                                                                    
scala> val question2 = !toBe || toBe 
val question2: Boolean = true
                                                                                                                    
scala> val question2 = !toBe || !toBe
val question2: Boolean = false
                                                                                                                    
scala> val question2 = !toBe && toBe
val question2: Boolean = false
                                                                                                                    
scala> def salt() = {println("salt"); false}
def salt(): Boolean
                                                                                                                    
scala> def pepper() = {println("pepper"); true}
def pepper(): Boolean
                                                                                                                    
scala> pepper() && salt()
pepper
salt
val res15: Boolean = false
                                                                                                                    
scala> pepper() || salt()
pepper
val res16: Boolean = true
                                                                                                                    
scala> pepper() || pepper() 
pepper
val res17: Boolean = true
                                                                                                                    
scala> salt() || salt()
salt
salt
val res18: Boolean = false
                                                                                                                    
scala> salt() && salt()
salt
val res19: Boolean = false
                                                                                                                    
scala> pepper() && pepper()
pepper
pepper
val res20: Boolean = true
                                                                                                                    
scala> // comparisons 
                                                                                                                    
scala> 1 == 1
val res21: Boolean = true
                                                                                                                    
scala> 1.0 == 1
val res22: Boolean = true
                                                                                                                    
scala> List(1, 2, 3) == List(1, 2, 3)
val res23: Boolean = true
                                                                                                                    
scala> List(1, 2, 5) == List(2, 1, 5) 
val res24: Boolean = false
                                                                                                                    
scala> // can even do concatenation 
                                                                                                                    
scala> ("he" + ""llo") == "hello"
-- [E040] Syntax Error: --------------------------------------------------------
1 |("he" + ""llo") == "hello"
  |          ^^^
  |          ')' expected, but string interpolator found
-- Error: ----------------------------------------------------------------------
1 |("he" + ""llo") == "hello"
  |                         ^
  |                         unclosed string literal
                                                                                                                    
scala> ("he" + "llo") == "hello"
val res25: Boolean = true
                                                                                                                    
scala> 2 << 2 + 2
val res26: Int = 32
                                                                                                                    
scala> 3 << 2
val res27: Int = 12
                                                                                                                    
scala> 3 << 3
val res28: Int = 24
                                                                                                                    
scala> 4 >> 3
val res29: Int = 0
                                                                                                                    
scala> 
