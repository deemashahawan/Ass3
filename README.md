S - Single Responsibility Principle => the project violate the SOLID principles Because invoice class do 3 behaviors They are different and have nothing to do with each other and the principle say that a class should only have one responsibility ,and the invoice do add ,delete .sendemail so we should do each function in sparet class
![image](https://user-images.githubusercontent.com/100956629/195835042-9f1ed9ba-1851-4d2f-a79a-87603b887aa7.png)

O - Open/Closed Principle=>the project violate the SOLID principles because if we want to add new operation to the (getOperationResult)we will modification to the code This is against the principle , so we creat a general interface contanes operation fun and implemants this intarface to all classes (MaxOp,MinOp .....and so on)so i do each operation in sparet class and override functions ,and if we want to add new op we just creat new class and extend from Calculator and override(getOperationResult)
super.getOperationResult() then add extension 
