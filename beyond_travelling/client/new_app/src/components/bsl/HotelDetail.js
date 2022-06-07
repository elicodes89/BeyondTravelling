import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';
import CityHotels from './CityHotels';

const HotelDetail = (props) => {
  const [selectedCity, setSelectedCity] = useState(null);
  const region = props.region;
  const cities = region.cities;

  const citiesList = cities.map((city, index) => {
    return <Button variant="light" onClick = {() => onCityClick(city) }><img src= {city.img} alt= "" width = "200px" /></Button>
  })

  const onCityClick = function(city){
    setSelectedCity(city);
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
      <h2>Please choose hotel</h2>
      <CityHotels selectedCity={selectedCity}/>
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