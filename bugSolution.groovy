```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  try {
    closure()
  } catch (RuntimeException e) {
    println "Caught exception in closure: ${e.message}"
    // Add more robust error handling here, e.g., logging, retrying, etc.
  }
  println "After closure execution"
}

methodWithClosure { 
  println "Inside the closure"
  throw new RuntimeException("Something went wrong")
}
```