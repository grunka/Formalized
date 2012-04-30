Formalized
==========

Something to make html forms simpler to handle

Idea
----

* Use annotations on a normal java class for form field names.
* Parse value to fit field type.
* Use validation annotations to do validations.
* Throw single exception for all validation errors with a list of errors.
* ValidationFault(fieldName, validationThatFailed)
* Handle file uploads as well.
