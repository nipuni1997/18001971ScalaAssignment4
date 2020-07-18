object cipher {
  def main(args: Array[String]): Unit = {

    println("Enter Code")
    val text = readLine()
    println("Enter key")
    val shift = readInt()
    val result = new StringBuffer
    for (i <- 0 until text.length) {
      if (Character.isUpperCase(text.charAt(i))) {
        val ch = ((text.charAt(i).toInt + shift - 65) % 26 + 65).toChar
        result.append(ch)
      }
      else {
        val ch = ((text.charAt(i).toInt + shift - 97) % 26 + 97).toChar
        result.append(ch)
      }
    }
    println("Encrypted code:\n"+result)
  }

  }
