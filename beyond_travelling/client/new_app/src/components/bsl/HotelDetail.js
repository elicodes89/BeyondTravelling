import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';
import CityHotels from './CityHotels';

const HotelDetail = (props) => {
  const [selectedCity, setSelectedCity] = useState(null);
  const region = props.region;
  const cities = region.cities;

  const citiesList = cities.map((city, index) => {
    return <Button variant="light" onClick = {() => onCityClick(city) }><img src= {city.img} alt= "" width = "330px" height = "320px" /></Button>
  })

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
      <li>{citiesList}</li>
      </>
    )
  } else if(selectedCity){
    return (
      <>
      <CityHotels selectedCity={selectedCity}/>
      <button Class = "button_1" onClick={() => onBackButton()}>Choose another city</button>
      </>
    )
  }
  else {
    return (
      <>
      {/* <a> {region.name} </a> */}
      <h1>Not clicked on city</h1>
      </>
    );
  };
};

export default HotelDetail;