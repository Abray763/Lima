

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukin Nama Kamu: ");
        String nama = sc.nextLine();

        System.out.print("Masukin NIM Kamu: ");
        String nim = sc.nextLine();

        System.out.print("Masukin IPK Kamu: ");
        float ipk = sc.nextFloat();
        sc.close();
        
        System.out.println();
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        System.out.println("IPK\t: " + ipk);
        
    }

}

