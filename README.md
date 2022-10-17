S - Single Responsibility Principle => the project violate the SOLID principles Because invoice class do 3 behaviors They are different and have nothing to do with each other and the principle say that a class should only have one responsibility ,and the invoice do add ,delete .sendemail so we should do each function in sparet class
![image](https://user-images.githubusercontent.com/100956629/195835042-9f1ed9ba-1851-4d2f-a79a-87603b887aa7.png)

O - Open/Closed Principle=>the project violate the SOLID principles because if we want to add new operation to the (getOperationResult)we will modification to the code This is against the principle , so we creat a general interface contanes operation fun and implemants this intarface to all classes (MaxOp,MinOp .....and so on)so i do each operation in sparet class and override functions ,and if we want to add new op we just creat new class and extend from Calculator and override(getOperationResult)
super.getOperationResult() then add extension 
![image](https://user-images.githubusercontent.com/100956629/196027227-8e8adfe9-c77e-485d-858c-fafbf57def26.png)
L - Liskov’s Substitution Principle=>


I - Interface Segregation Principle=>the project violate the SOLID principles Because bird intrface have 3 fun and when we implement to eagle then we should override swim fun and eagle dont need it and the principle say larger interfaces by breaking application interfaces into smaller ones.

![image](https://user-images.githubusercontent.com/100956629/196032913-bf5f59b1-8926-452b-82cf-e53628250d68.png)

D - Dependency Inversion Principle=>the project violate the SOLID principles Because WindowsMachine depend on low-level modules(Keyboard,Monitor) and the principle say high-level modules should depend on abstractions ,so i make interface product and implement low-level this interface to prevent WindowsMachine depend on low-level ,but depend on abstraction(product) and in the main set which product type i want 

![image](https://user-images.githubusercontent.com/100956629/196162205-30a5f94e-0d78-498f-9d6a-824af61fdd1e.png)

