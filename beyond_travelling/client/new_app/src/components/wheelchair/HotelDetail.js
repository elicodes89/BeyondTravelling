import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';
import CityHotels from './CityHotels';

const HotelDetail = (props) => {
  const [selectedCity, setSelectedCity] = useState(null);
  const region = props.region;
  const cities = region.cities;

  const citiesList = cities.map((city, index) => {
    return <Button variant="light" onClick = {() => onCityClick(city) }><img src= {city.img} alt= "citiesimages" width = "330px" height = "320px" /></Button>
  })
  // console.log(cities);

  const onCityClick = function(city){
    setSelectedCity(city);

}

const onBackButton = function () {
  setSelectedCity(null);
}

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
      <h3>Great! You can now navigate through the hotels.</h3>
      <CityHotels selectedCity={selectedCity}/>
      <button Class = "button_1" onClick={() => onBackButton()}>Choose another city</button>
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