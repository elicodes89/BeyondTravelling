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

  function task(){
    console.log(cityHotelsList)
  }
setTimeout(task, 1000);

  const onCityClick = function(cityHotel){
    setSelectedCityHotel(cityHotel);
}

  if (selectedCity != undefined && selectedCityHotel === null) {
    return (
      <>

    <p>{cityHotelsList}</p>
      </>
    )  
} else if(selectedCityHotel != null){
  return (
  <div>
    <br>
    </br>
    <h2>{selectedCityHotel.hotel_name}</h2>   
    <br></br>
    {/* <li>{selectedCityHotel.hotel_name}</li> */}
    <li>Contact number: {selectedCityHotel.contact_number}</li>
    <li><a href= {selectedCityHotel.website}>Hotel Website</a></li>
    <li>Address: {selectedCityHotel.address}</li>
    <li>{selectedCityHotel.img}</li>

    <iframe width="560" height="315" src={selectedCityHotel.img} title="Video" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    <br></br>
  </div>
  
  )  
}
else {
  return (
    <>
    <h1>Oops. Try Again.</h1>
    </>
  );
};
};

export default CityHotels;