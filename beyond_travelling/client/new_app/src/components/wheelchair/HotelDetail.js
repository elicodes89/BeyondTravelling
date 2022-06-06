import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';
import CityHotels from './CityHotels';

const HotelDetail = (props) => {
  const [selectedCity, setSelectedCity] = useState(null);
  const region = props.region;
  const cities = region.cities;

  const citiesList = cities.map((city, index) => {
    return <div><Button variant="light" onClick = {() => onCityClick(city) }><img src= {city.img} alt= "" width = "200px" /></Button></div>
  })
  // console.log(cities);

  const onCityClick = function(city){
    setSelectedCity(city);
}
// console.log(citiesList)

  if (region != undefined && region.cities.length != 0 && !selectedCity) {
    return (
      <>
      {/* <a> {region.name} </a> */}
      <p>{citiesList}</p>
      {/* <img src= "https://raw.githubusercontent.com/elicodes89/BeyondTravelling/develop/beyond_travelling/client/new_app/src/ireland_images/countryside2.jpg" alt= "" width = "200px" /> */}
      </>
    )
  } else if(selectedCity){
    return (
      <>
      {/* <h3>Please choose the hotel</h3> */}
      <CityHotels selectedCity={selectedCity}/>
      </>
    )
  }
  else {
    return (
      <>
      {/* <a> {region.name} </a> */}
      <h1>No cities available</h1>
     

      </>
    )
  }
 
  
}

export default HotelDetail;