import java.util.Scanner;


	public class Nokia{
		public static void main (String[] args){

	Scanner input = new Scanner(System.in);

System.out.print("1.Phonebook\n2.Messages\n3.Chat\n4.Call Register\n5.Tones\n6.Settings\n7.Call Divert\n8.Games");
System.out.print("\n9.Calculator\n10.Reminder\n11.Clock\n12.Profiles\n13.Sim Services\n");
System.out.print("Enter number:");
int number = input.nextInt();


if(number == 1){
System.out.println("Press");

System.out.print("\n1.Search\n2.Service Nos\n3.Add Name\n4.Erase\n5.Edit\n6.Assign Tone\n7.Send b' Card");

System.out.print("\n8.Options\n9.Spead dails\n10.Voice tags\n");

System.out.print("Enter Number:");
 int numb = input.nextInt();

if(numb == 2){
System.out.print("Servis Nos");

}else if(numb == 3){
System.out.print("Add Number"); 

}else if(numb == 4){
System.out.print("Erase");

}else if(numb == 5){
System.out.print("Edit");

}else if(numb == 6){
System.out.print("Assign Tone");

}else if(numb == 7){
System.out.print("Send b'card");

}else if(numb == 9){
System.out.print("Spead dial");

}else if(numb == 10){
System.out.print("Voice Tag");
}

 if(numb == 8){
System.out.print("Press");

System.out.print("\n1.Type of View\n2.Memory Status\n");

System.out.print("Enter Number:");
 int numbers = input.nextInt();

if(numbers == 1)
System.out.print("Type of View");

if(numbers == 2)
System.out.print("Memory Full");
}

}else if(number == 2){
System.out.print("Press\n");

System.out.print("\n1.Write Message\n2.Inbox\n3.Outbox\n4.Picture Messages\n5.Templates\n6.Smileys\n7.Message settings\n8.Info service\n9.Voice mailbox number\n10.services command editor\n");
System.out.print("Enter Number:");
int numb = input.nextInt();

if(numb == 1){
System.out.print("Write Message");

}else if(numb == 2){
System.out.print("Ibox");

}else if(numb == 3){
System.out.print("Outbox"); 

}else if(numb == 4){
System.out.print("Picture message");

}else if(numb == 5){
System.out.print("Templates");

}else if(numb == 6){
System.out.print("smileys");

}else if(numb == 8){
System.out.print("Info Service");

}else if(numb == 9){
System.out.print("Voice mailbox number");

}else if(numb == 10){
System.out.print("Service command editor");

}else if(numb == 7){
System.out.print("Set 1\n2.Common\n");
System.out.print("Enter Number");
int numbers = input.nextInt();

if(numbers == 1){
System.out.print("1. Message Center Number\n2.Message Sents as\n3.Message Validty\n");
System.out.print("Enter Number");
int numberss = input.nextInt();

if(numberss == 1){
System.out.print("Message Center Number");

}else if(numberss == 2){
System.out.print("Message Sents as");

}else if(numberss == 3){
System.out.print("Message Validty");
   }
  }else if(numbers == 2){
System.out.print("1.Devlivery Reports\n2.Reply Via Same Centre\n3.Character Support\n");
System.out.print("Enter Number:");
int numberss = input.nextInt();

if(numberss == 1){
System.out.print("Delivery reports");
}else if(numberss == 2){
System.out.print("Reply via same centre");
}else if(numberss == 3){
System.out.print("Character Support");
   }

  } 
 
}

}else if(number == 3){
System.out.print("Chat");

}else if(number == 4){
System.out.print("Press\n");

System.out.print("\n1.Missed calls\n2.Recevied Calls\n3.Dialled number\n4.Erase recent call list\n5.Show call duration\n6.Show call cost\n7.Call cost settings\n8.Prepaid credit\n");
System.out.print("Enter Number:");
int numb = input.nextInt();

if(numb == 1){
System.out.print("10 Missed Calls ");

}else if(numb == 2){
System.out.print("11 Received Call");

}else if(numb == 3){
System.out.print("900 Dialled Number"); 

}else if(numb == 4){
System.out.print("1000 Erased Recent Calls");

}else if(numb == 5){

System.out.print("\n1. Last call Duration\n2.All call duration\3.Recived calls duration\n4.Dialled Calls duration\n5.Clear time\n");

System.out.print("Enter Number:");
int numbers = input.nextInt();

if(numbers == 1){
System.out.print("Last call duration:76hrs with babe");

}else if(numbers == 2){
System.out.print("All calls’ duration:1000hrs");

}else if(numbers == 3){
System.out.print("Received calls’ duration");

}else if(numbers == 4){
System.out.print(" Dialled calls’ duration");

}else if(numbers == 5){
System.out.print(" Clear timers");
}
}else if(numb == 6){
System.out.print("\n1.last call cost\n2.All calls cost\n3.Clear counter\n");
System.out.print("Enter Number:");
int numbers = input.nextInt();

if(numbers == 1){
System.out.print("last call cost : $1000");

}else if(numbers == 2){
System.out.print("All cost:$10000");

}else if(numbers == 3){
System.out.print("Clear timers");
  }
}else if(numb == 7 ){

System.out.print("\n1.Call cost limit\n2.Show coast limits\n");
System.out.print("Enter Number:");
int numbers = input.nextInt();

if(numbers == 1){
System.out.print("call cost limit: $10000");

}else if(numbers == 2){
System.out.print("All cost:$1000000");
 }
}else if (numb == 8){
System.out.print("Prepid credit : 20000");
}


}else if(number == 5){
System.out.println("Press");
System.out.print("\n1.ringing tone\n2.Ringing volume\n3.incoming call alert\n4.Composer\n5.Message alert tones\n6.Keypad tones\n7.Warning and game tones\n");
System.out.print("\n8.Vibrating alert\n9.Screan saver\n");

System.out.print("Enter Number:");
 int numb = input.nextInt();

if(numb == 1){
System.out.print("Ringing tones");


}else if(numb == 2){
System.out.print("Ringing volume");

}else if(numb == 3){
System.out.print("incoming call alert"); 

}else if(numb == 4){
System.out.print("Composer");

}else if(numb == 5){
System.out.print("Message alert tones");

}else if(numb == 6){
System.out.print("Keypad tones");

}else if(numb == 7){
System.out.print("Warning and game tones");

}else if(numb == 8){
System.out.print("Vibrating alert");

}else if(numb == 9){
System.out.print("Screan saver");
 }


}else if(number == 6){
System.out.println("Press");
System.out.print("\n1.call settings\n2.Phone settings\n3.Security settings\n4.Restore factory settings\n");

System.out.print("Enter Number:");
 int numb = input.nextInt();

if(numb == 1){
System.out.print("\n1.Automatic redial\n2.Speed dialling\n3.Call waiting options\n4.Own number sending\n5.Phone line in use\n6.Automatic answer 1\n");
System.out.print("Enter Number:");
int numbers = input.nextInt();

if(numbers == 1){
System.out.print("Automatic redial");

}else if(numbers == 2){
System.out.print("Speed dialling");

}else if(numbers == 3){
System.out.print("Call waiting options");

}else if(numbers == 4){
System.out.print("Own number sending");

}else if(numbers == 5){
System.out.print("Phone line in use");

}else if(numbers == 6){
System.out.print("Automatic answer 1");
}

}else if(numb == 2){
System.out.print("\n1. Language\n2.Cell info display\n3.Welcome note\n4.Network selection\n5.Lights 2\n6.Confirm SIM service actions\n");
System.out.print("Enter Number:");
int numberss = input.nextInt();

if(numberss == 1){
System.out.print("Language");

}else if(numberss == 2){
System.out.print("Cell info display");

}else if(numberss == 3){
System.out.print("Welcome note");

}else if(numberss == 4){
System.out.print("Network selection");

}else if(numberss == 5){
System.out.print("Lights 2");

}else if(numberss == 6){
System.out.print("Confirm SIM service actions");
}


}else if(numb == 3){
System.out.print("\n1.PIN code request\n2.Call barring service\n3.Fixed dialling\n4.Closed user group\n5.Phone security\n6.Change access codes\n");
System.out.print("Enter Number:");
int numbersss = input.nextInt();

if(numbersss == 1){
System.out.print("PIN code request");

}else if(numbersss == 2){
System.out.print("Call barring service");

}else if(numbersss == 3){
System.out.print("Fixed dialling");

}else if(numbersss == 4){
System.out.print("Closed user group");

}else if(numbersss == 5){
System.out.print("Phone security");

}else if(numbersss == 6){
System.out.print("Change access codes");
}
}else if(numb == 4){
System.out.print(" Restore factory settings");
 }
}else if(number == 7){
System.out.print("Call divert");

}else if(number == 8){
System.out.print("Games");

}else if(number == 9){
System.out.print("Calculator");

}else if(number == 10){
System.out.print("Reminders");


}else if(number == 11){
System.out.println("Press");
System.out.print("\n1.Alarm clock\n2.Clock settings\n3. Date setting\n4.Stopwatch\n5.Countdown timer\n6.Auto update of date and time\n");
System.out.print("Enter Number:");
 int numb = input.nextInt();

if(numb == 1){
System.out.print("Alarm clock");


}else if(numb == 2){
System.out.print("Clock settings");

}else if(numb == 3){
System.out.print("Date setting"); 

}else if(numb == 4){
System.out.print("Stopwatch");

}else if(numb == 5){
System.out.print("Countdown timer");

}else if(numb == 6){
System.out.print("Auto update of date and time");
 }


}else if(number == 12){
System.out.print("Profiles");

}else if(number == 13){
System.out.print("SIM services 3");
}













		  

	


















    }
}