import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';

const CityHotels = (props) => {
const [selectedCityHotel, setSelectedCityHotel] = useState(null);
const selectedCity = props.selectedCity;
const cityHotels = selectedCity.hotels;

  const cityHotelsList = cityHotels.map((cityHotel, index) => {
    return <div><Button variant="light" onClick = {() => onCityClick(cityHotel) }>{cityHotel.hotel_name}</Button></div>

  })
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
      <li>{cityHotelsList}</li>
      </>
    )  
} else if(selectedCityHotel != null){
  return (
    <>
    <h2>{selectedCityHotel.hotel_name}</h2>
    {/* <li>Hotel:{selectedCityHotel.hotel_name}</li> */}
    <li>Contact number:{selectedCityHotel.contact_number}</li>
    <li><a href= {selectedCityHotel.website}>Hotel Website</a></li>
    <li>Address: {selectedCityHotel.address}</li>
    </>
  )  
}
else {
  return (
    <>
    <h1>No hotel available</h1>
    </>
  )
}
}

export default CityHotels;