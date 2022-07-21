Last login: Wed Jul 20 06:48:06 on ttys000
andrewcastillo@Andrews-Air ~ % scala
Welcome to Scala 3.1.3 (1.8.0_292, Java OpenJDK 64-Bit Server VM).
Type in expressions for evaluation. Or try :help.
                                                                                                                  
scala> //Chapter 4 Notes 
                                                                                                                  
scala> 

                                                                                                                      
scala> class ChecksumAccumulator
	// defined class ChecksumAccumulator
                                                                                                                      
scala> class ChecksumAccumulator
// defined class ChecksumAccumulator
                                                                                                                      
scala> class ChecksumAccumulator:
     | var sum = 0
-- Error: ----------------------------------------------------------------------
2 |var sum = 0
  |^^^
  |indented definitions expected, var found
                                                                                                                      
scala> class ChecksumAccumulator:
     | var sum = 0
-- Error: ----------------------------------------------------------------------
2 |var sum = 0
  |^^^
  |indented definitions expected, var found
                                                                                                                      
scala> class ChecksumAccumulator:
     |  var sum = 0
     | 
// defined class ChecksumAccumulator
                                                                                                                      
scala> acc = new CheckSumAccumulator 
-- [E006] Not Found Error: -----------------------------------------------------
1 |acc = new CheckSumAccumulator 
  |^^^
  |Not found: acc
  |
  | longer explanation available when compiling with `-explain`
-- [E006] Not Found Error: -----------------------------------------------------
1 |acc = new CheckSumAccumulator 
  |          ^^^^^^^^^^^^^^^^^^^
  |          Not found: type CheckSumAccumulator
  |
  | longer explanation available when compiling with `-explain`
2 errors found
                                                                                                                      
scala> val acc = new CheckSumAccumulator
-- [E006] Not Found Error: -----------------------------------------------------
1 |val acc = new CheckSumAccumulator
  |              ^^^^^^^^^^^^^^^^^^^
  |              Not found: type CheckSumAccumulator
  |
  | longer explanation available when compiling with `-explain`
1 error found
                                                                                                                      
scala> val acc = new ChecksumAccumulator
val acc: ChecksumAccumulator = ChecksumAccumulator@49c83262
                                                                                                                      
scala> acc.sum
val res0: Int = 0
                                                                                                                      
scala> acc.sum = 7
                                                                                                                      
scala> acc.sum
val res1: Int = 7
                                                                                                                      
scala> val acc = new ChecksumAccumulator
val acc: ChecksumAccumulator = ChecksumAccumulator@16d61071
                                                                                                                      
scala> acc = new ChecksumAccumulator
-- [E052] Type Error: ----------------------------------------------------------
1 |acc = new ChecksumAccumulator
  |^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  |Reassignment to val acc
  |
  | longer explanation available when compiling with `-explain`
1 error found
                                                                                                                      
scala> val acc = new CheckSumAccumulator:
     |  private var sum = 0
     | 
-- [E006] Not Found Error: -----------------------------------------------------
1 |val acc = new CheckSumAccumulator:
  |              ^^^^^^^^^^^^^^^^^^^
  |              Not found: type CheckSumAccumulator
  |
  | longer explanation available when compiling with `-explain`
1 error found
                                                                                                                      
scala> class CheckSumAccumulator:
     |  private var sum = 0
     | 
// defined class CheckSumAccumulator
                                                                                                                      
scala> val acc = new CheckSumAccumulator
val acc: CheckSumAccumulator = CheckSumAccumulator@6a0c7af6
                                                                                                                      
scala> acc.sum = 6
-- Error: ----------------------------------------------------------------------
1 |acc.sum = 6
  |^^^^^^^
  |variable sum cannot be accessed as a member of (acc : CheckSumAccumulator) from module class rs$line$11$.
1 error found
                                                                                                                      
scala> acc.sum
-- Error: ----------------------------------------------------------------------
1 |acc.sum
  |^^^^^^^
  |variable sum cannot be accessed as a member of (acc : CheckSumAccumulator) from module class rs$line$11$.
1 error found
                                                                                                                      
scala> // Ah, since sum is private within the class, the only code that can access it is the code within the class itself. 
                                                                                                                      
scala> // define a clas with private fields inside it 
                                                                                                                      
scala> class CheckSumAccumulator:
     |  private var sum = 0
     |  def add(b:Unit): Unit = 
     |      sum += b
     |  def checksum(): Int = 
     |      return ~(sum & OxFF) + 1 
     | 
-- [E008] Not Found Error: -----------------------------------------------------
4 |		sum += b
  |		^^^^^^
  |		value += is not a member of Int - did you mean Int.!=?
-- [E006] Not Found Error: -----------------------------------------------------
6 |		return ~(sum & OxFF) + 1 
  |		               ^^^^
  |		               Not found: OxFF
  |
  | longer explanation available when compiling with `-explain`
2 errors found
                                                                                                                      
scala> class CheckSumAccumulator:
     |  private var sum = 0
     |  def add(b:Byte): Unit = 
     |      sum += b
     |  def checksum(): Int = 
     |      return ~(sum & OxFF) + 1
     | 
-- [E006] Not Found Error: -----------------------------------------------------
6 |		return ~(sum & OxFF) + 1
  |		               ^^^^
  |		               Not found: OxFF
  |
  | longer explanation available when compiling with `-explain`
1 error found
                                                                                                                      
scala> class CheckSumAccumulator:
     |  private var sum = 0
     |  def add(b:Byte): Unit = 
     |      sum += b
     |  def checksum(): Int = 
     |      return ~(sum) + 1
     | 
// defined class CheckSumAccumulator
                                                                                                                      
scala> class CheckSumAccumulator:
     |  private var sum = 0
     |  def add(b:Byte): Unit = 
     |      sum += b
     |  def checksum(): Int = 
     |      return ~(sum & 0xFF) + 1
     | 
// defined class CheckSumAccumulator
                                                                                                                      
scala> //0xFF is a is a hex literal meaning int(255) just defining the type of object returned from the checksum method. 
                                                                                                                      
scala> //make it more concise 
                                                                                                                      
scala> class CheckSumAccumulator:
     |  private var sum = 0
     |  def add(b:Byte): Unit = sum += b
     |  def checksum(): Int = ~(sum & 0xFF) + 1
     | 
// defined class CheckSumAccumulator
                                                                                                                      
scala> // don't need return statements but can depend on the situation. Makes it much more familiar to Python and looks easier to read. 
                                                                                                                      
scala> import scala.collection.mutable 
                                                                                                                      
scala> object CheckSumAccumulator: 
     |  private val cache = mutable.Map.empty[String, Int]
     |  def calculate(s: String): Int = 
     |      if cache.contains(s) then 
     |          cache(s)
     |      else 
     |          val acc = new CheckSumAccumulator
     |          for c <- s do 
     |              acc.add((c>>8).toByte)
     |              acc.add(c.toByte)
     |          val cs = acc.checksum()
     |          cache += (s -> cs)
     |          cs
     | 
// defined object CheckSumAccumulator
                                                                                                                      
scala> case class Person(name: String, age: Int)
// defined case class Person
                                                                                                                      
scala> val p = Person("Sally", 39)
val p: Person = Person(Sally,39)
                                                                                                                      
scala> p.name
val res2: String = Sally
                                                                                                                      
scala> p.age
val res3: Int = 39
                                                                                                                      
scala> p.toString
val res4: String = Person(Sally,39)
                                                                                                                      
scala> p == Person("Sally", 21)
val res5: Boolean = false
                                                                                                                      
scala> p.hasCode == Person("Sally", 21).hashCode
-- [E008] Not Found Error: -----------------------------------------------------
1 |p.hasCode == Person("Sally", 21).hashCode
  |^^^^^^^^^
  |value hasCode is not a member of Person - did you mean p.hashCode?
1 error found
                                                                                                                      
scala> p.hashCode == Person("Sally", 21).hashCode
val res6: Boolean = false
                                                                                                                      
scala> p == Person("James", 23)
val res7: Boolean = false
                                                                                                                      
scala> import CheckSumAccumulator.calculate 
                                                                                                                      
scala> object Summer: 
     |  def main(args: Array[String]): Unit = 
     |      for arg <- args do
     |          println(arg + ": " + calculate(arg))
     | 
// defined object Summer
                                                                                                                      
scala> exit
-- [E006] Not Found Error: -----------------------------------------------------
1 |exit
  |^^^^
  |Not found: exit
  |
  | longer explanation available when compiling with `-explain`
1 error found
                                                                                                                      
scala> exit()
-- [E006] Not Found Error: -----------------------------------------------------
1 |exit()
  |^^^^
  |Not found: exit
  |
  | longer explanation available when compiling with `-explain`
1 error found
                                                                                                                      
scala> :quit
andrewcastillo@Andrews-Air ~ % cd data_science
cd: no such file or directory: data_science
andrewcastillo@Andrews-Air ~ % cd Desktop/data_science/scala_notebooks/chapter_4
cd: no such file or directory: Desktop/data_science/scala_notebooks/chapter_4
andrewcastillo@Andrews-Air ~ % cd Desktop/data_science/scala_notebooks/chapter_4
cd: no such file or directory: Desktop/data_science/scala_notebooks/chapter_4
andrewcastillo@Andrews-Air ~ % cd Desktop/data_science/scala_notebooks/chapter_4
cd: no such file or directory: Desktop/data_science/scala_notebooks/chapter_4
andrewcastillo@Andrews-Air ~ % cd Desktop/data_science/scala_notebooks/chapter_4\
> 
cd: no such file or directory: Desktop/data_science/scala_notebooks/chapter_4
andrewcastillo@Andrews-Air ~ % cd Desktop/data_science/scala_notebooks/chapter_4
cd: no such file or directory: Desktop/data_science/scala_notebooks/chapter_4
andrewcastillo@Andrews-Air ~ % cd Desktop/data_science/scala_notebooks/chapter_4
andrewcastillo@Andrews-Air chapter_4 % scalac CheckSumAccumulator.scala Summer.scala 
andrewcastillo@Andrews-Air chapter_4 % scala Summer of love
of: -213
love: -182
andrewcastillo@Andrews-Air chapter_4 % scala
Welcome to Scala 3.1.3 (1.8.0_292, Java OpenJDK 64-Bit Server VM).
Type in expressions for evaluation. Or try :help.
                                                                                                                      
scala> val acc = new CheckSumAccumulator
val acc: CheckSumAccumulator = CheckSumAccumulator@36224f93
                                                                                                                      
scala> acc.sum
-- Error: ----------------------------------------------------------------------
1 |acc.sum
  |^^^^^^^
  |variable sum cannot be accessed as a member of (acc : CheckSumAccumulator) from module class rs$line$2$.
1 error found
                                                                                                                      
scala> acc.add
val res0: Byte => Unit = Lambda$1433/1270816977@6fced25c
                                                                                                                      
scala> acc.add(4)
                                                                                                                      
scala> acc.checksum()
val res1: Int = -4
                                                                                                                      
scala> 
