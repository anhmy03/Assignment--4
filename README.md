## Get list of Students

### Request

    `GET /animals/all`

    `http://localhost:8080/amimals/all`

   
### Response

     [
   
     {"animalID": 1, "name": "example1", "scientificName": null, "species": cat, "habitat": "", "description": null}, 
   
     {"animalID": 2, "name": "example2", "scientificName": null, "species": dog, "habitat": "", "description": null}, 
   
     {"animalID": 3, "name": "example3", "scientificName": null, "species": bird, "habitat": "", "description": null}, 
   
     ]

## Get a specific Animal

### Request

`GET /animals/{id}`

`http://localhost:8080/animals/1`

### Response

    {
     {"animalID": 1, "name": "cat1", "scientificName": null, "species": cat, "habitat": "", "description": null}, 
    }

     
## Create a new Animal

### Request

    `POST /animals/new`
    
    `http://localhost:8080/students/new` --data '{"name": "example4", "scientificName": null, "species": fish, "habitat": "", "description": null}'

   ### Response

   [
   
     {"animalID": 1, "name": "example1", "scientificName": null, "species": cat, "habitat": "", "description": null}, 
   
     {"animalID": 2, "name": "example2", "scientificName": null, "species": dog, "habitat": "", "description": null}, 
   
     {"animalID": 3, "name": "example3", "scientificName": null, "species": bird, "habitat": "", "description": null}, 
     
     {"animalID": 4, "name": "example4", "scientificName": null, "species": fish, "habitat": "", "description": null}   
  ]

## Get Animal by name

### Request

    `GET /animals/search?name=example1`

    `http://localhost:8080/animals/search?name=example1`

   
### Response

     [
   
     {"animalID": 1, "name": "example1", "scientificName": null, "species": cat, "habitat": "", "description": null}
     
     ]

## Get Animal by specie

### Request

    `GET /animals/species/{species}`

    `http://localhost:8080/animals/species/dog`

   
### Response

   [
   
     {"animalID": 2, "name": "example2", "scientificName": null, "species": dog, "habitat": "", "description": null} 
        
   ]

## Update an existing Animal

### Request

    `PUT /animals/update/{id}`
    
    `http://localhost:8080/students/update/1` --data '{"name": "update1", "scientificName": null, "species": cat, "habitat": "", "description": null}'


   ### Response
   
    {
     {"animalID": 1, "name": "update1", "scientificName": null, "species": cat, "habitat": "", "description": null}
    }


## Delete an existing Animal

### Request

    `DELETE /animals/delete/{id}`
    
    `http://localhost:8080/animals/delete/1`

   ### Response
   
   [
   
     {"animalID": 2, "name": "example2", "scientificName": null, "species": dog, "habitat": "", "description": null}, 
   
     {"animalID": 3, "name": "example3", "scientificName": null, "species": bird, "habitat": "", "description": null}, 
     
     {"animalID": 4, "name": "example4", "scientificName": null, "species": fish, "habitat": "", "description": null}   
   
  ]
