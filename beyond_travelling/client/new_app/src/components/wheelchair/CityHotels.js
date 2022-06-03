import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';

const CityHotels = (props) => {
const [selectedCityHotel, setSelectedCityHotel] = useState(null);
const selectedCity = props.selectedCity;
const cityHotels = selectedCity.hotels;

  const cityHotelsList = cityHotels.map((cityHotel, index) => {
    return <div><Button variant="light" onClick = {() => onCityClick(cityHotel) }>{cityHotel.hotel_name}</Button></div>

  })

  console.log(cityHotels)

  const onCityClick = function(cityHotel){
    setSelectedCityHotel(cityHotel);
}

  if (selectedCity != undefined && selectedCityHotel === null) {
    return (
      <>

      <li>{cityHotelsList}</li>
      </>
    )  
} else if(selectedCityHotel != null){
  return (
  <div>
<h1>Selected Hotel</h1>
    <li>{selectedCityHotel.id}</li>
    <li>{selectedCityHotel.hotel_name}</li>
    <li>{selectedCityHotel.contact_number}</li>
    <a href= {selectedCityHotel.website}>Webpage</a>
    <li>{selectedCityHotel.address}</li>
    <li>{selectedCityHotel.img}</li>
    {/* <img src= "https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/ireland_images/countryside2.jpg" alt= "" width = "200px" /> */}

    <iframe width="560" height="315" src={selectedCityHotel.img} title="Video" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

  </div>
  
  )  
}
else {
  return (
    <>

    <h1>hey</h1>
    </>
  )
}
}

export default CityHotels;