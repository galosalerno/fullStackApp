import { Container } from '@material-ui/core';
import { makeStyles } from '@material-ui/core/styles';
import Paises from './components/Paises';
const useStyles = makeStyles(() => ({
  root: {
    marginTop: '50px',
  },
  fixedHeader: {
    marginBottom: '40px',
    fontSize: '30px',
    color: 'DarkRed',
    backgroundColor: 'Khaki',
    textAlign: 'center',
  },
}));

export default function App() {
  const classes = useStyles();

  return (
    <Container maxWidth="xl" className={classes.root}>
      <Paises></Paises>
    </Container>
  );
}
