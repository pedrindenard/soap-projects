import zeep

url = 'http://localhost:8080/albums?wsdl'
client = zeep.Client(url)

while True:

    print("Menu:")
    print("1 - View registered album titles")
    print("2 - View all albums information")
    print("3 - View albums from a specific year")
    print("4 - Insert album")
    print("0 - Exit")

    choice = input("Choose an option: ")

    if choice == "1":
        response = client.service.getAlbumsTitle()
        print("Registered album titles:")
        print(response)

    elif choice == "2":
        response = client.service.getAlbums()
        print("All albums information:")
        print(response)

    elif choice == "3":
        year = input("Enter the year to view albums: ")
        response = client.service.getAlbumByYear(int(year))
        print(f"Albums from the year {year}:")
        print(response)

    elif choice == "4":
        name = input("Enter the album name: ")
        year = int(input("Enter the album year: "))
        artist = input("Enter the artist name: ")
        response = client.service.insertAlbum(name, year, artist)
        print("Album inserted successfully!")

    elif choice == "0":
        print("Exiting the program. Goodbye!")
        break

    else:
        print("Invalid option. Please try again.")
