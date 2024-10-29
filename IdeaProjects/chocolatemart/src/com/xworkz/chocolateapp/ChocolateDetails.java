package com.xworkz.chocolateapp;

import java.util.Arrays;

public class ChocolateDetails {
    {
        String[] chocolateNames ={null, null, null, null, null, null,null,null,null,null};
        String ChocolateName;
        public void Chocolate()
        {
            int Chocolateindex = 0;
            boolean ischocolateNameCreated = false;
            String chocolateName = "null";
            if (chocolateName != null)
            {
                chocolateNames[Chocolateindex] = ChocolateName;
                Chocolateindex++;
                ischocolateNameCreated = true;
            } else System.out.println("Only Provide a added chatName");
            return ischocolateNameCreated;
        }
        public static void getChat()
        {
            System.out.println("--------------------------------------------------------------");
            for(String chocolateNames : ChocolateNames)
            {
                System.out.println("The available chat names are: "+chocolateNames);
            }
        }
        public boolean updateChatName(String oldChocolateName, String newChocolateName)
        {
            boolean isChocolateNameUpdated=false;
            for(int index=0; index < chocolateNames.length ; index++)
            {
                if(oldChocolateName == chocolateNames[index])
                {
                    chocolateNames[index] = newChocolateName;
                    isChocolateNameUpdated=true;
                }
            }
            if(isChocolateNameUpdated == false)
            {
                System.out.println(oldChocolateName + "Not added");
            }return isChocolateNameUpdated;
        }
        public static boolean deleteChatNames(String chatNameDeleted)
        {
            System.out.println("Deleting chat name started");
            boolean isChatNameDeleted = false;
            int oldIndex, newIndex;
            for(newIndex=0, oldIndex=0; oldIndex < ChatNames.length; oldIndex++)
            {
                if(ChatNames[oldIndex] != chatNameDeleted)
                {
                    ChatNames[newIndex] = ChatNames[oldIndex];
                    newIndex++;
                }
            }
            ChatNames = Arrays.copyOf(ChatNames , newIndex);
            if(ChatNames != null)
            {
                isChatNameDeleted = true;
            }
            if(isChatNameDeleted = false)
            {
                System.out.println(chatNameDeleted + "Not found");
            }
            System.out.println("Deleting chat name ended");
            return isChatNameDeleted;
        }
    }
}
