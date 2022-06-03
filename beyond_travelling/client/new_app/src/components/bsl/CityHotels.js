import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';

const CityHotels = (props) => {
const [selectedCityHotel, setSelectedCityHotel] = useState(null);
const selectedCity = props.selectedCity;
const cityHotels = selectedCity.hotels;

  const cityHotelsList = cityHotels.map((cityHotel, index) => {
    return <div><Button variant="light" onClick = {() => onCityClick(cityHotel) }>{cityHotel.hotel_name}</Button></div>

  })

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
    <h1>Selected BSL Hotel</h1>
    <li>{selectedCityHotel.hotel_name}</li>
    <li>{selectedCityHotel.contact_number}</li>
    <li>{selectedCityHotel.website}</li>
    <li>{selectedCityHotel.address}</li>
    </>
  )  
}
else {
  return (
    <>

    <h1>hey from BSL CityHotels</h1>
    </>
  )
}
}

export default CityHotels;