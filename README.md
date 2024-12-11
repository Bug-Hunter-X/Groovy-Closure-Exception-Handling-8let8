# Groovy Closure Exception Handling

This example demonstrates a common issue when working with closures in Groovy:  exceptions thrown within a closure might not be properly handled by the calling method.

## The Problem

In the `bug.groovy` file, the `methodWithClosure` function executes a provided closure. If the closure throws an exception, the `methodWithClosure` function doesn't catch it, and the exception isn't handled properly. This could be problematic in scenarios expecting robust error handling.

## The Solution

The `bugSolution.groovy` file shows how to properly handle exceptions within closures.  By wrapping the closure's execution in a `try-catch` block, the calling method can capture and manage any exception thrown by the closure.

This is crucial for creating robust and reliable Groovy applications.