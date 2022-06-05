import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';

const CityHotels = (props) => {
const [selectedCityHotel, setSelectedCityHotel] = useState(null);
const selectedCity = props.selectedCity;
const cityHotels = selectedCity.hotels;

  const cityHotelsList = cityHotels.map((cityHotel, index) => {
    return <div><Button variant="light" onClick = {() => onCityClick(cityHotel) }><img src= {cityHotel.img2} alt= "" width = "200px" /></Button></div>

  })

  console.log(cityHotels)

  const onCityClick = function(cityHotel){
    setSelectedCityHotel(cityHotel);
}

  if (selectedCity != undefined && selectedCityHotel === null) {
    return (
      <>

    <p>{cityHotelsList}</p>
      {/* <img src= {cityHotelsList.img2} alt= "" width = "200px" /> */}
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
    <br></br>
    <img src= {selectedCityHotel.img} alt= "" width = "200px" />
    <br></br>
    <iframe width="560" height="315" src={selectedCityHotel.img} title="Video" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    <br></br>
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