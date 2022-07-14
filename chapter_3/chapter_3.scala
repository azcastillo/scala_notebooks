Last login: Mon Jul 11 07:34:25 on ttys000
andrewcastillo@Andrews-Air ~ % scala
Welcome to Scala 3.1.3 (1.8.0_292, Java OpenJDK 64-Bit Server VM).
Type in expressions for evaluation. Or try :help.
                                                    
//// Programming in Scala Chapter 3 - Ramblings 
                                                                                
scala> val greetStrings = new Array[String(3)]
-- [E040] Syntax Error: --------------------------------------------------------
1 |val greetStrings = new Array[String(3)]
  |                                   ^
  |                                   ']' expected, but '(' found
                                                                                
scala> val greetStrings = new Array[String](3)
val greetStrings: Array[String] = Array(null, null, null)
                                                                                
scala> greetStrings(0) = "Hello"
                                                                                
scala> greetStrings(1) = ","
                                                                                
scala> greetStrings(2) = "World"
                                                                                
scala> for i <- 0 to 2 do
     | print(greetStrings(i))
Hello,World~                                                                               
scala> val numNames = Array("zero", "one", "two")
val numNames: Array[String] = Array(zero, one, two)
                                                                                
scala> numNames
val res0: Array[String] = Array(zero, one, two)
                                                                                
scala> 




                                                                                                                       
scala> val oneTwoThree = List(1,2,3)
val oneTwoThree: List[Int] = List(1, 2, 3)
                                                                                                                       
scala>   val oneTwo = List(1, 2)
val oneTwo: List[Int] = List(1, 2)
                                                                                                                             
scala> val threeFour = List(3,4)
val threeFour: List[Int] = List(3, 4)
                                                                                                                             
scala> val oneTwoThreeFours = oneTwo ::: threeFour
val oneTwoThreeFours: List[Int] = List(1, 2, 3, 4)
                                                                                                                             
scala> val twoThree = List(2, 3)
val twoThree: List[Int] = List(2, 3)
                                                                                                                             
scala> val oneTwoThree = 1 :: twoThree 
val oneTwoThree: List[Int] = List(1, 2, 3)
                                                                                                                             
scala> val iniList = List(4, 5, 6)
val iniList: List[Int] = List(4, 5, 6)
                                                                                                                             
scala> val newList = 7 +: iniList
val newList: List[Int] = List(7, 4, 5, 6)
                                                                                                                             
scala> val newList2 = 7 :+  iniList
-- [E008] Not Found Error: -----------------------------------------------------
1 |val newList2 = 7 :+  iniList
  |               ^^^^
  |               value :+ is not a member of Int
1 error found
                                                                                                                             
scala> val thrill = "Will" :: "fill" :: "until" :: Nil
val thrill: List[String] = List(Will, fill, until)
                                                                                                                             
scala> val thrill2 = "Will" :: "fill" :: "until"
-- [E008] Not Found Error: -----------------------------------------------------
1 |val thrill2 = "Will" :: "fill" :: "until"
  |                               ^^^^^^^^^^
  |                               value :: is not a member of String
1 error found
                                                                                                                             
scala> thrill.drop(2)
val res1: List[String] = List(until)
                                                                                                                             
scala> thrill.foreach(println())
-- [E007] Type Mismatch Error: -------------------------------------------------
1 |thrill.foreach(println())
  |               ^^^^^^^^^
  |               Found:    Unit
  |               Required: String => Any
  |
  | longer explanation available when compiling with `-explain`
1 error found
                                                                                                                             
scala> thrill.foreach(println)
Will
fill
until
                                                                                                                             
scala> thrill.sortWith((s,t) => s.charAt(0).toLower < t.charAt(0).toLower)
val res2: List[String] = List(fill, until, Will)
                                                                                                                             
scala> val pair = (99, "ballons")
val pair: (Int, String) = (99,ballons)
                                                                                                                             
scala> num = pair(0)
-- [E006] Not Found Error: -----------------------------------------------------
1 |num = pair(0)
  |^^^
  |Not found: num
  |
  | longer explanation available when compiling with `-explain`
1 error found
                                                                                                                             
scala> val num = pair(0)
val num: Int = 99
                                                                                                                             
scala> val what = pair(1)
val what: String = ballons
                                                                                                                             
scala> num
val res3: Int = 99
                                                                                                                             
scala> what
val res4: String = ballons
                                                                                                                             
scala> var jetSet = Set("Boeing", "Airbus")
var jetSet: Set[String] = Set(Boeing, Airbus)
                                                                                                                             
scala> jetSet += "Lear"
                                                                                                                             
scala> jetSet
val res5: Set[String] = Set(Boeing, Airbus, Lear)
                                                                                                                             
scala> val query = jetSet.contains("Cessna")
val query: Boolean = false
                                                                                                                             
scala> val jets = ("howdy")
val jets: String = howdy
                                                                                                                             
scala> jets += "howdy_2"
-- [E008] Not Found Error: -----------------------------------------------------
1 |jets += "howdy_2"
  |^^^^^^^
  |value += is not a member of String - did you mean jets.!=?
1 error found
                                                                                                                             
scala> import scala.collection.mutable 
                                                                                                                             
scala> val movieSet = mutable.Set("Spotlight", "Moonlight")
val movieSet: scala.collection.mutable.Set[String] = HashSet(Spotlight, Moonlight)
                                                                                                                             
scala> movieSet += "Parasite"
val res6: scala.collection.mutable.Set[String] = HashSet(Spotlight, Parasite, Moonlight)
                                                                                                                             
scala> val moviePop = ("howdy", "ope")
val moviePop: (String, String) = (howdy,ope)
                                                                                                                             
scala> moviePop += "long"
-- [E008] Not Found Error: -----------------------------------------------------
1 |moviePop += "long"
  |^^^^^^^^^^^
  |value += is not a member of (String, String) - did you mean moviePop.!=?
1 error found
                                                                                                                             
scala> import scala.collections.immutable.HashSet
-- [E008] Not Found Error: -----------------------------------------------------
1 |import scala.collections.immutable.HashSet
  |       ^^^^^^^^^^^^^^^^^
  |value collections is not a member of scala - did you mean scala.collection?
1 error found
                                                                                                                             
scala> import scala.collection.immutable.HashSet
                                                                                                                             
scala> val hashSet = HashSet("Tomatoes", "Chiles")
val hashSet: scala.collection.immutable.HashSet[String] = HashSet(Tomatoes, Chiles)
                                                                                                                             
scala> val ingredients = HashSet + "Corieander"
-- [E008] Not Found Error: -----------------------------------------------------
1 |val ingredients = HashSet + "Corieander"
  |                  ^^^^^^^^^
  |value + is not a member of object scala.collection.immutable.HashSet, but could be made available as an extension method.
  |
  |One of the following imports might make progress towards fixing the problem:
  |
  |  import math.Fractional.Implicits.infixFractionalOps
  |  import math.Integral.Implicits.infixIntegralOps
  |  import math.Numeric.Implicits.infixNumericOps
  |
1 error found
                                                                                                                             
scala> val ingredients = hashSet + "Corieander"
val ingredients: scala.collection.immutable.HashSet[String] = HashSet(Corieander, Tomatoes, Chiles)
                                                                                                                             
scala> import scala.collection.mutabl
-- [E008] Not Found Error: -----------------------------------------------------
1 |import scala.collection.mutabl
  |                        ^^^^^^
  |value mutabl is not a member of collection - did you mean collection.mutable?
1 error found
                                                                                                                             
scala> import scala.collection.mutable
                                                                                                                             
scala> val treasureMap = mutable.Map.empty[Int, String]
val treasureMap: scala.collection.mutable.Map[Int, String] = HashMap()
                                                                                                                             
scala> treasureMap += (1 -> "Go to island")
val res7: scala.collection.mutable.Map[Int, String] = HashMap(1 -> Go to island)
                                                                                                                             
scala> treasureMap += (2 -> "Find big X on ground")
val res8: scala.collection.mutable.Map[Int, String] = HashMap(1 -> Go to island, 2 -> Find big X on ground)
                                                                                                                             
scala> treasureMap += (3 -> "Dig.")
val res9: scala.collection.mutable.Map[Int, String] = HashMap(1 -> Go to island, 2 -> Find big X on ground, 3 -> Dig.)
                                                                                                                             
scala> step2 = treasureMap(2)
-- [E006] Not Found Error: -----------------------------------------------------
1 |step2 = treasureMap(2)
  |^^^^^
  |Not found: step2
  |
  | longer explanation available when compiling with `-explain`
1 error found
                                                                                                                             
scala> val step2 = treasureMap(2)
val step2: String = Find big X on ground
                                                                                                                             
scala> val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III")
val romanNumeral: Map[Int, String] = Map(1 -> I, 2 -> II, 3 -> III)
                                                                                                                             
scala> val three = romanNumeral(3)
val three: String = III
                                                                                                                             
scala> def printArgs(args: List[String]): Unit = 
     | args.foreach(println)
def printArgs(args: List[String]): Unit
                                                                                                                             
scala> printArgs(List["Howdy", "Andrew"])
-- [E023] Syntax Error: --------------------------------------------------------
1 |printArgs(List["Howdy", "Andrew"])
  |          ^^^^^^^^^^^^^^^^^^^^^^^
  |     Too many type arguments for scala.collection.IterableFactory.apply[A]
  |     expected: [A]
  |     actual:   ["Howdy".type, "Andrew".type]
  |
  | longer explanation available when compiling with `-explain`
1 error found
                                                                                                                             
scala> val init =printArgs(List["Howdy", "Andrew"])
-- [E023] Syntax Error: --------------------------------------------------------
1 |val init =printArgs(List["Howdy", "Andrew"])
  |                    ^^^^^^^^^^^^^^^^^^^^^^^
  |     Too many type arguments for scala.collection.IterableFactory.apply[A]
  |     expected: [A]
  |     actual:   ["Howdy".type, "Andrew".type]
  |
  | longer explanation available when compiling with `-explain`
1 error found
                                                                                                                             
scala> val init =printArgs(List("Howdy", "Andrew"))
Howdy
Andrew
                                                                                                                             
scala> printArgs(List("Howdy", "Andrew"))
Howdy
Andrew
                                                                                                                             
scala> def formatArgs(args: List[String]) = args.mkString("\n")
def formatArgs(args: List[String]): String
                                                                                                                             
scala> formatArgs(List("Andrew", "Howdy"))
val res10: String = Andrew
Howdy
                                                                                                                             
scala> val res = formatArgs(List("zero", "one", "two"))
val res: String = zero
one
two
                                                                                                                             
scala> assert(res == "zero\none\ntwo")
                                                                                                                             
scala> // Transform with Map and for-yield 
                                                                                                                             
scala> val adjectives = List("One", "Two", "Three", "Four")
val adjectives: List[String] = List(One, Two, Three, Four)
                                                                                                                             
scala> val nouns = adjectives.map(adj => adj + "Fish")
val nouns: List[String] = List(OneFish, TwoFish, ThreeFish, FourFish)
                                                                                                                             
scala> val nouns = adjectives.map(adj => adj + " Fish")
val nouns: List[String] = List(One Fish, Two Fish, Three Fish, Four Fish)
                                                                                                                             
scala> // can also do this with a for loop and yield 
                                                                                                                             
scala> for adj <- adjectives yield 
     | adj + " Fish"
val res11: List[String] = List(One Fish, Two Fish, Three Fish, Four Fish)
                                                                                                                             
scala> val nouns = 
     | for adj <- adjectives yield 
     |      | adj + " Fish"
     | 
-- [E006] Not Found Error: -----------------------------------------------------
3 |     | adj + " Fish"
  |     ^
  |     Not found: |
  |
  | longer explanation available when compiling with `-explain`
1 error found
                                                                                                                             
scala> val nouns = 
     | for adj <- adjectives yield 
     |  adj + " Fish"
     | 
val nouns: List[String] = List(One Fish, Two Fish, Three Fish, Four Fish)
                                                                                                                             
scala> //changing the type of the lists 
                                                                                                                             
scala> val lengths = nouns.map(noun => nouns.length)
val lengths: List[Int] = List(4, 4, 4, 4)
                                                                                                                             
scala> nouns
val res12: List[String] = List(One Fish, Two Fish, Three Fish, Four Fish)
                                                                                                                             
scala> val lengths = 
     | for noun <- nouns yield 
     | noun.length
val lengths: List[Int] = List(8, 8, 10, 9)
                                                                                                                             
scala> // can also change other types of data types e.g., Vectors 
                                                                                                                             
scala> val ques = Vector("Who", "What", "When", "Where", "How")
val ques: Vector[String] = Vector(Who, What, When, Where, How)
                                                                                                                             
scala> val usingMap = ques.map(que => que + "?")
val usingMap: Vector[String] = Vector(Who?, What?, When?, Where?, How?)
                                                                                                                             
scala> val usingMap = ques.map(que => que.toLowercase() + "?")
-- [E008] Not Found Error: -----------------------------------------------------
1 |val usingMap = ques.map(que => que.toLowercase() + "?")
  |                               ^^^^^^^^^^^^^^^
  |value toLowercase is not a member of String - did you mean que.toLowerCase?
1 error found
                                                                                                                             
scala> val usingMap = ques.map(que => que.toLowercase + "?")
-- [E008] Not Found Error: -----------------------------------------------------
1 |val usingMap = ques.map(que => que.toLowercase + "?")
  |                               ^^^^^^^^^^^^^^^
  |value toLowercase is not a member of String - did you mean que.toLowerCase?
1 error found
                                                                                                                             
scala> val usingMap = ques.map(que => que.toLowerCase + "?")
val usingMap: Vector[String] = Vector(who?, what?, when?, where?, how?)
                                                                                                                             
scala> val usingForYield = 
     | for q <- in ques yield 
-- [E018] Syntax Error: --------------------------------------------------------
2 |for q <- in ques yield 
  |                 ^^^^^
  |                 expression expected but yield found
  |
  | longer explanation available when compiling with `-explain`
                                                                                                                             
scala> val usingForYield = 
     | for q <- ques yield
     | q.toLowerCase + "?"
val usingForYield: Vector[String] = Vector(who?, what?, when?, where?, how?)
                                                                                                                             
scala> // using options 
                                                                                                                             
scala> val startsW = ques.find(q => startsWith("W"))
-- [E006] Not Found Error: -----------------------------------------------------
1 |val startsW = ques.find(q => startsWith("W"))
  |                             ^^^^^^^^^^
  |                             Not found: startsWith
  |
  | longer explanation available when compiling with `-explain`
1 error found
                                                                                                                             
scala> val startsW = ques.find(q => q.startsWith("W"))
val startsW: Option[String] = Some(Who)
                                                                                                                             
scala> val length4 = ques.find(q => q.length == 4))
-- [E040] Syntax Error: --------------------------------------------------------
1 |val length4 = ques.find(q => q.length == 4))
  |                                           ^
  |                                           eof expected, but ')' found
                                                                                                                             
scala> val length4 = ques.find(q => q.length == 4)
val length4: Option[String] = Some(What)
                                                                                                                             
scala> val length5 = ques.find(q => q.length == 5)
val length5: Option[String] = Some(Where)
                                                                                                                             
scala> val startsH = ques.find(q => q.startsWith("H"))
val startsH: Option[String] = Some(How)
                                                                                                                             
scala> 
