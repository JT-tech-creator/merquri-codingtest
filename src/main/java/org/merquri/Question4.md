**Question 4:**

*If you use the same PreAuthorize configuration on each method in a class, how can you
make the annotations cleaner?*


**Answer:**

We can move the `@PreAuthorize` configuration to the class level instead, 
by annotating the class with `@PreAuthorize` 
and removing the existing `@PreAuthorize` annotations on each method in this class.