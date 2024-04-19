import java.util.*;
class quiz
{
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);
        int i, marks = 0,life = 5 , count = 0;
        System.out.println("\t LET'S START WITH OUR QUIZ GAME \n");
        System.out.println("LET US DISCUSS THE RULE OF THE GAME FIRST ");
        System.out.println("RULE 1: YOU ARE PROVIDED WITH 5 LIFE AND ON EVERY WRONG ANSWER YOU WILL LOSE YOUR 1 LIFE AND ON EVERY 5 CORRECT ANSWER YOU WILL GAIN 1 LIFE ");
        System.out.println("RULE 2: YOU WILL HAVE TEN SECTION IN THIS GAME \n EACH SECTION WILL CONTAIN TEN QUESTIONS");
        System.out.println("RULE 3: CHOSE YOU CORRECT OPTION BY PRESSING 1 , 2 , 3 , 4 \n");
        System.out.println("LET'S BEGIN");
        {
            for(i = 0;i<=100;i++)
            {
                if(i==1)
                {
                    System.out.println(" \t This section of quiz will deal with record-breaking athletes and the history and rules of sports. \n");
                    System.out.println("SO YOUR FIRST QUESTION IS");
                    System.out.println("");
                    System.out.println("1. When Michael Jordan played for the Chicago Bulls, how many NBA Championships did he win?");
                    System.out.println("1 - six ");
                    System.out.println("2 - three");
                    System.out.println("3 - four");
                    System.out.println("4 - two ");
                    System.out.println("");
                    int choice = sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS SIX \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i = 0;i<=100;i++)
            {
                if(i==2)
                {
                    System.out.println("2. Which Williams sister has won more Grand Slam titles?");
                    System.out.println("1- AMELIA");
                    System.out.println("2- EMMA");
                    System.out.println("3 - AVA");
                    System.out.println("4- SERENA");
                    System.out.println("enter your choice");
                    int choice = sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks+" \n");
                        count++;
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS SERENA \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i = 0;i<=100;i++)
            {
                if(i==3)
                {
                    System.out.println("3. Which racer holds the record for the most Grand Prix wins?");
                    System.out.println("1- Lewis Ethane");
                    System.out.println("2- Michael Schumacher ");
                    System.out.println("3- Harold Glen ");
                    System.out.println("4- Julian Conner");
                    System.out.println("enter your choice");
                    int choice =sc.nextInt();
                    if(choice == 2)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS MICHAEL SCHUMACHER \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i = 0;i<=100;i++)
            {
                if(i==4)
                {
                    System.out.println("4. Which Jamaican runner is an 11-time world champion and holds the record in the 100 and 200-meter race?");
                    System.out.println("1- Bryan Clay ");
                    System.out.println("2- Usain Bolt");
                    System.out.println("3- Paula Radcliffe");
                    System.out.println("4- Haile Gebrselassie");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==2)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS USAIN BOLT \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i = 0;i<=100;i++)
            {
                if(i==5)
                {
                    System.out.println("5. Which boxer was known as “The Greatest” and “The People’s Champion”?");
                    System.out.println("1- Bryan Clay ");
                    System.out.println("2- Paula Radcliffe");
                    System.out.println("3- Muhammad Ali");
                    System.out.println("4- Haile Gebrselassie");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==3)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            System.out.println("LIFE = "+life+ "\n");
                            count = 0;
                            
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Muhammad Ali \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i = 0;i<=100;i++)
            {
                if(i==6)
                {
                    System.out.println("6. What country won the very first FIFA World Cup in 1930?");
                    System.out.println("1- Uruguay");
                    System.out.println("2- Belgium ");
                    System.out.println("3- France");
                    System.out.println("4- Brazil");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");

                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Uruguay \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i=0;i<=100;i++)
            {
                if(i==7)
                {
                    System.out.println("7. Which of these events is NOT part of a decathlon?");
                    System.out.println("1- Badminton");
                    System.out.println("2- Cricket ");
                    System.out.println("3- Cycling");
                    System.out.println("4- Hammer throw");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");

                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Hammer TThrow \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i=0;i<=100;i++)
            {
                if(i==8)
                {
                    System.out.println("8. Which hockey team did Wayne Gretzky play for in the ‘80s?");
                    System.out.println("1- Mikko Koskinen");
                    System.out.println("2- Oscar Klefbom");
                    System.out.println("3- Edmonton Oilers");
                    System.out.println("4- Leon Draisaitl");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==3)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS EDMONTON OILERS \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i=0;i<=100;i++)
            {
                if(i==9)
                {
                    System.out.println("9. In what year was the first ever Wimbledon Championship held?");
                    System.out.println("1- 1877");
                    System.out.println("2- 1875");
                    System.out.println("3- 1879");
                    System.out.println("4- 1870");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS 1877 \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==10)
                {
                    System.out.println("10. How many soccer players should each team have on the field at the start of each match?");
                    System.out.println("1- 15");
                    System.out.println("2- 12");
                    System.out.println("3- 16");
                    System.out.println("4- 11");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTreturn;ION IS 11 \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i = 0;i<=100;i++)
            {
                if(i==11)
                {
                    System.out.println("\t This section of quiz will deal with on cellular phones, operating systems, the history of the computer and social media. \n");
                    System.out.println("1. What year was the very first model of the iPhone released?");
                    System.out.println("1- 1999 ");
                    System.out.println("2- 2009");
                    System.out.println("3- 2007");
                    System.out.println("4- 2013");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==3)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            System.out.println("LIFE = "+life+ "\n");
                            count = 0;
                            
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS 2007 \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i = 0;i<=100;i++)
            {
                if(i==12)
                {
                    System.out.println("2. What’s the shortcut for the “copy” function on most computers?");
                    System.out.println("1- ctrl + c");
                    System.out.println("2- shift + c");
                    System.out.println("3- alt + c");
                    System.out.println("4- tab + c");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");

                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS ctrl + c \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i = 0;i<=100;i++)
            {
                if(i==13)
                {
                    System.out.println("3. What does “HTTP” stand for?");
                    System.out.println("1- Hyperspace Transport Protocol");
                    System.out.println("2- Hyper Textual Transfer Protocol");
                    System.out.println("3- Human Textual Transaction Process");
                    System.out.println("4- HyperText Transfer Protocol");
                    System.out.println("enter your choice");
                    int choice = sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks+" \n");
                        count++;
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS HyperText Transfer Protocol \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i = 0;i<=100;i++)
            {
                if(i==14)
                {
                    System.out.println("4. What is the name of the man who launched eBay back in 1995?");
                    System.out.println("1- Jeff Bezos");
                    System.out.println("2- Pierre Omidyar ");
                    System.out.println("3- Sergey Brin");
                    System.out.println("4- Elon Musk");
                    System.out.println("enter your choice");
                    int choice =sc.nextInt();
                    if(choice == 2)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Pierre Omidyar \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i = 0;i<=100;i++)
            {
                if(i==15)
                {
                    System.out.println("5. What is often seen as the smallest unit of memory?");
                    System.out.println("1- gigabyte");
                    System.out.println("2- kilobyte");
                    System.out.println("3- megabyte");
                    System.out.println("4- terabyte");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();    
                    if(choice==2)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS kilobyte \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i = 0;i<=100;i++)
            {
                if(i==16)
                {
                    System.out.println("6. Which email service is owned by Microsoft?");
                    System.out.println("1- Gmail ");
                    System.out.println("2- Outlook");
                    System.out.println("3- Hotmail");
                    System.out.println("4- Mail");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==3)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            System.out.println("LIFE = "+life+ "\n");
                            count = 0;
                            
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Hotmail \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i = 0;i<=100;i++)
            {
                if(i==17)
                {
                    System.out.println("7. Google Chrome, Safari, Firefox and Explorer are different types of what?");
                    System.out.println("1-  Web browsers");
                    System.out.println("2- applications");
                    System.out.println("3- games");
                    System.out.println("4- websites");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");

                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS  Web browsers \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i=0;i<=100;i++)
            {
                if(i==18)
                {
                    System.out.println("8. Is Java a type of OS?");
                    System.out.println("1- YES");
                    System.out.println("2- NO ");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");

                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS NO \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i=0;i<=100;i++)
            {
                if(i==19)
                {
                    System.out.println("9. Who is often called the father of the computer?");
                    System.out.println("1- Elon musk");
                    System.out.println("2- Tim Berners-Lee");
                    System.out.println("3- Charles Babbage");
                    System.out.println("4-Brendan Eich");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==3)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Charles Babbage \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i=0;i<=100;i++)
            {
                if(i==20)
                {
                    System.out.println("10. What was Twitter’s original name?");
                    System.out.println("1- twttr");
                    System.out.println("2- tweet ");
                    System.out.println("3- twetor");
                    System.out.println("4- tweter");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS twttr \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==21)
                {
                    System.out.println(" \t This section of quiz will deal with weather, planets and elements. \n");
                    System.out.println("1. Who discovered penicillin?");
                    System.out.println("1- Werner Arber ");
                    System.out.println("2- Karl Ernst von Baer");
                    System.out.println("3- David Baltimore");
                    System.out.println("4- Alexander Fleming");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Alexander Fleming \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i = 0;i<=100;i++)
            {
                if(i==22)
                {
                    System.out.println("2. What is meteorology the study of?");
                    System.out.println("1- The weather");
                    System.out.println("2- Marine Life");
                    System.out.println("3- Art History");
                    System.out.println("4- Space Exploration");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            System.out.println("LIFE = "+life+ "\n");
                            count = 0;
                            
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS The weather \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i = 0;i<=100;i++)
            {
                if(i==23)
                {
                    System.out.println("3. Which planet is the hottest in the solar system?");
                    System.out.println("1- Venus");
                    System.out.println("2- Mercury");
                    System.out.println("3- Jupitar");
                    System.out.println("4- Mars");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");

                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Venus \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==24)
                {
                    System.out.println("4. What part of the atom has no electric charge?");
                    System.out.println("1- Electron");
                    System.out.println("2- Proton");
                    System.out.println("3- Neutron");
                    System.out.println("4- None of These");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Neutron \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==25)
                {
                    System.out.println("5. Which natural disaster is measured with a Richter scale?");
                    System.out.println("1- Tsunami");
                    System.out.println("2- Flood");
                    System.out.println("3- Drougth");
                    System.out.println("4- Earthquack");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Earthquack \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==26)
                {
                    System.out.println("6.What is the symbol of Potassium");
                    System.out.println("1- P");
                    System.out.println("2- K");
                    System.out.println("3- Na");
                    System.out.println("4- Cl");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==2)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS K \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==27)
                {
                    System.out.println("What animals are pearls found in?");
                    System.out.println("1- Dolphins");
                    System.out.println("2- Flamingos");
                    System.out.println("3- Oysters");
                    System.out.println("4- Elephants");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==3)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Oysters \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==28)
                {
                    System.out.println("8. Who was the first woman to win a Nobel Prize (in 1903)?");
                    System.out.println("1- Marie Curie ");
                    System.out.println("2- Rosa Parks");
                    System.out.println("3- Amelia Earhart");
                    System.out.println("4- Florence Nightingale");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Marie Curie \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==29)
                {
                    System.out.println("9. Which planet has the most gravity?");
                    System.out.println("1- Saturn");
                    System.out.println("2- Mars");
                    System.out.println("3- Earth");
                    System.out.println("4- Jupitar");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Jupitar \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==30)
                {
                    System.out.println("10. How many molecules of oxygen does ozone have?");
                    System.out.println("1- 2");
                    System.out.println("2- 3");
                    System.out.println("3- 1");
                    System.out.println("4- 5");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==2)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS 3 \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==31)
                {
                    System.out.println("This section of quiz will deal the body’s systems, organs and diseases.\n");
                    System.out.println("1. Which organ has four chambers?");
                    System.out.println("1- The heart");
                    System.out.println("2- The Liver");
                    System.out.println("3- The Kidney");
                    System.out.println("4- The Lungs");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Heart \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }for(i =0;i<=100;i++)
            {
                if(i==32)
                {
                    System.out.println("2. In which body part can you find the femur?");
                    System.out.println("1- Hand");
                    System.out.println("2- Stomach");
                    System.out.println("3- Head");
                    System.out.println("4- Leg");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Leg \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==33)
                {
                    System.out.println("3. About how many taste buds does the average human tongue have?");
                    System.out.println("1- 5,000");
                    System.out.println("2- 10,000");
                    System.out.println("3- 17,000");
                    System.out.println("4- 2,000");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==2)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS 10,000 \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==34)
                {
                    System.out.println("4. What percentage of our bodies is made up of water?");
                    System.out.println("1- 60%-65%");
                    System.out.println("2- 65%-70%");
                    System.out.println("3- 40%-50%");
                    System.out.println("4- 50%-60%");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS 60%-65% \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==35)
                {
                    System.out.println("5. Which element is said to keep bones strong?");
                    System.out.println("1- sodium");
                    System.out.println("2- potasssium");
                    System.out.println("3- phosphorus");
                    System.out.println("4- Calcium");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Calcium \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==36)
                {
                    System.out.println("6. What does the acronym AIDS stand for?");
                    System.out.println("1- Allergic Inflammatory Disease Syndrome");
                    System.out.println("2- Acquired Immune Deficiency Syndrome");
                    System.out.println("3- Advanced Infection Development Syndrome");
                    System.out.println("4- American Institute for Disease Studies");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==2)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Acquired Immune Deficiency Syndrome \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==37)
                {
                    System.out.println("7. How many times does the heart beat per day?");
                    System.out.println("1- More Than 50000");
                    System.out.println("2- More Than 70000");
                    System.out.println("3- More than 100000");
                    System.out.println("4- More than 60000");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==3)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS 100000 \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==38)
                {
                    System.out.println("8. What is your body’s largest organ?");
                    System.out.println("1- The liver");
                    System.out.println("2- The Heart");
                    System.out.println("3- The Stomach");
                    System.out.println("4- The skin");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS The skin \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==39)
                {
                    System.out.println("9. What kind of cells are found in the brain?");
                    System.out.println("1- Temporary");
                    System.out.println("2- Blood");
                    System.out.println("3-Dendrites ");
                    System.out.println("4-Neurons");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS  Neurons \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==40)
                {
                    System.out.println("10. Which bone are babies born without?");
                    System.out.println("1- Knee -cap");
                    System.out.println("2- Femur");
                    System.out.println("3- Carpals");
                    System.out.println("4- Skull");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Knee-cap \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==41)
                {
                    System.out.println("\t This section of quiz will deal with geography \n");
                    System.out.println("1. Which continent is the largest?");
                    System.out.println("1- Australia");
                    System.out.println("2- Antarctica");
                    System.out.println("3- Africa");
                    System.out.println("4- Asia");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Asia \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==42)
                {
                    System.out.println("2. Which of the Seven Wonders is located in Egypt?");
                    System.out.println("1- Temple of Artemis at Ephesus");
                    System.out.println("2- Colossus of Rhodes");
                    System.out.println("3- Hanging Gardens of Babylon");
                    System.out.println("4- The Pyramids of Giza");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS The Pyramids of Giza \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==43)
                {
                    System.out.println("3. What is the name of the thin, but long country that spans more than half of the western coast of South America?");
                    System.out.println("1- Chile");
                    System.out.println("2- Norway");
                    System.out.println("3- Vietnam");
                    System.out.println("4- Italy");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Chile \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==44)
                {
                    System.out.println("4. Which American state is the largest (by area)?");
                    System.out.println("1- Alaska");
                    System.out.println("2- Texas");
                    System.out.println("3- Montana");
                    System.out.println("4- Colorado");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Alaska \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==45)
                {
                    System.out.println("5. What is the capital of New Zealand?");
                    System.out.println("1- Auckland");
                    System.out.println("2- Hamilton");
                    System.out.println("3- Wellington");
                    System.out.println("4- Christchurch");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==3)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Wellington \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==46)
                {
                    System.out.println("6. Which desert is the largest in the world?");
                    System.out.println("1- The Sahara Desert");
                    System.out.println("2- Arabian Desert");
                    System.out.println("3- Gobi Desert");
                    System.out.println("4- Antarctic Polar Desert");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS The Sahara Desert  \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }for(i =0;i<=100;i++)
            {
                if(i==47)
                {
                    System.out.println("7. What is the name of the world’s longest river?");
                    System.out.println("1- The Amazon River");
                    System.out.println("2- The Yangtze Rive");
                    System.out.println("3- The Mississippi");
                    System.out.println("4- The Nile");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS The Nile \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==48)
                {
                    System.out.println("8. Which two countries share the longest (or largest) international border?");
                    System.out.println("1- Kazakhstan - Russia");
                    System.out.println("2- Canada and the USA");
                    System.out.println("3- Argentina - Chile");
                    System.out.println("4- China - Mongolia");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==2)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Canada and the USA \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }for(i =0;i<=100;i++)
            {
                if(i==49)
                {
                    System.out.println("9. Which city in India would you find the Taj Mahal in?");
                    System.out.println("1- Mumbai");
                    System.out.println("2- Varanasi");
                    System.out.println("3- Delhi");
                    System.out.println("4- Agra");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==4)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Agra \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");      
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
            for(i =0;i<=100;i++)
            {
                if(i==50)
                {
                    System.out.println("10. What is the smallest country in the world?");
                    System.out.println("1- Monaco");
                    System.out.println("2- Tuvalu");
                    System.out.println("3- Vatican City");
                    System.out.println("4- Pakistan");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==3)
                    {
                        System.out.println("correct answer");
                        marks++;
                        System.out.println("YOUR MARKS = "+marks +"\n");
                        count++;
                        if(count>= 5)
                        {
                            life++;
                            System.out.println("WELL DONE \n");
                            System.out.println("YOUR LIFE IS INCREASED BY 1");
                            count = 0;
                            System.out.println("LIFE = "+life+ "\n");
                        }
                    }
                    else if(life >= 1 )
                    {
                        System.out.println("OOPS - wrong answer \n");
                        System.out.println("YOU HAVE "+life+" life that's why you are getting promoted \n");
                        System.out.println("THE ANSWER OF THE QUESTION IS Vatican City \n");
                        System.out.println("YOU HAVE USED YOUR ONE LIFE \n SO YOUR LIFE IS DEDUCTED BY ONE \n");
                        life--;
                        System.out.println("YOUR LIFE = "+life +"\n");

                    }
                    else
                    {
                     System.out.println("OOPS - wrong answer \n");
                     System.out.println("YOU HAVE LOST YOUR ALL LIVES \n SO YOU ARE OUT FROM THE GAME \n");
                     System.out.println("GAME OVER");
                     return;
                    }
                }
            }
        }
    
    }
}




